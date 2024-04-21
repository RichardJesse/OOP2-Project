package Database;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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
                updateMigrationList(migrationName);
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
            String content = "package Database.Migrations;\n"
                    + "import Database.*;"
                    + "public class " + migrationName + " extends Migration {\n"
                    + "    @Override\n"
                    + "    public void up() {\n";

            if (migrationName.startsWith("Create")) {
                content += "        String sql = createTable(\"" + tableName + "\")\n"
                        + "            .id()\n"
                        + "            .timestamp()\n"
                        + "            .build();\n"
                        + "        executeStatement(sql);\n";
            } else if (migrationName.startsWith("Add")) {
                String[] result = mnp.getColumnNameAndTableName(migrationName);
                String columnName = result[0];
                String tableToAddColumn = result[1];

                content += "      addColumn(\"" + tableToAddColumn + "\", \"" + columnName + "\");\n"
                        + "     ";
            }

            content += "    }\n"
                    + "\n"
                    + "    @Override\n"
                    + "    public void down() {\n"
                    + "        // TODO: Add your rollback code here\n"
                    + "    }\n"
                    + "}";

            Path path = Paths.get("./src/Database/Migrations/" + migrationName + ".java");
            Files.write(path, content.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void updateMigrationList(String migrationName) {
        try {
            Path path = Paths.get("./src/Database/migrations.txt");
            String content = migrationName + "\n";
            Files.write(path, content.getBytes(), StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
