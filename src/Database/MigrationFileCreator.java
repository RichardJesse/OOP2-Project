package Database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MigrationFileCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command:");
            String command = scanner.nextLine();

            if (command.startsWith("make:migration")) {
                String migrationName = command.split(" ")[1];
                createMigrationFile(migrationName);
                System.out.println("Created migration file: " + migrationName + ".java");
                addMigration(migrationName);
            } else if ("exit".equals(command)) {
                break;
            } else {
                System.out.println("Unknown command.");
            }
        }

        scanner.close();
    }

    private static void createMigrationFile(String migrationName) {
        MigrationNameParser mnp = new MigrationNameParser();
        try {
            String tableName = mnp.getTableName(migrationName);
            System.out.println(tableName);
            String content = """
                             package Database.Migrations;
                             import Database.*;
                             public class  """ +   migrationName + "  extends Migration {\n"
                    + "    @Override\n"
                    + "    public void up() {\n";

            if (migrationName.startsWith("Create")) {
                content += "        String sql = createTable(\"" + tableName + "\")\n"
                        + "            .id()\n"
                        + "            .build();\n"
                        + "        executeStatement(sql);\n";
            } else if (migrationName.startsWith("Add")) {
                String[] result = mnp.getColumnNameAndTableName(migrationName);
                String columnName = result[0];
                String tableToAddColumn = result[1];

                content += "      addColumn(\"" + tableToAddColumn + "\", \"" + columnName + "\");\n"
                        + "     ";
            }

            content += """
                           }
                       
                           @Override
                           public void down() {
                               // TODO: Add your rollback code here
                           }
                       }""";

            Path path = Paths.get("./src/Database/Migrations/" + migrationName + ".java");
            Files.write(path, content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   private static void addMigration(String migrationName) {
    try {
        Path path = Paths.get("./src/Database/migrations.txt");
        List<String> lines = Files.readAllLines(path);

        // Remove trailing empty lines
        int lastNonEmptyLineIndex = lines.size() - 1;
        while (lastNonEmptyLineIndex >= 0 && lines.get(lastNonEmptyLineIndex).trim().isEmpty()) {
            lastNonEmptyLineIndex--;
        }
        
        // Retain only the non-empty lines
        lines = lines.subList(0, lastNonEmptyLineIndex + 1);

        // Add the new migration at the bottom
        lines.add(migrationName);

        Files.write(path, lines);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
}
