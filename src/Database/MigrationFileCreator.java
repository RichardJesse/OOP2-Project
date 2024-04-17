package Database;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
            } else if ("exit".equals(command)) {
                break;
            } else {
                System.out.println("Unknown command.");
            }
        }

        scanner.close();
    }

    private static void createMigrationFile(String migrationName) {
        try {
            String content = "public class " + migrationName + " extends Migration {\n"
                    + "    @Override\n"
                    + "    public void up() {\n"
                    + "        // TODO: Add your migration code here\n"
                    + "    }\n"
                    + "\n"
                    + "    @Override\n"
                    + "    public void down() {\n"
                    + "        // TODO: Add your rollback code here\n"
                    + "    }\n"
                    + "}";
            Path path = Paths.get("./src/Database/" + migrationName + ".java");
            Files.write(path, content.getBytes());
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
