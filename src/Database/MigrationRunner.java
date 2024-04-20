package Database;

import Database.Migrations.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class MigrationRunner {
    public static void main(String[] args) {
        // Read the list of all your migration classes from a file
        List<Class<? extends Migration>> migrationClasses = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get("./src/Database/migrations.txt"));
            for (String line : lines) {
                // Compile the .java file
                String javaFileName = "Database/Migrations/" + line.trim() + ".java";
                System.out.println(javaFileName);
                JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
                compiler.run(null, null, null, javaFileName);

                // Load the .class file
                Class<? extends Migration> migrationClass = (Class<? extends Migration>) Class.forName("Database.Migrations." + line.trim());
                migrationClasses.add(migrationClass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Assume MigrationTable is a class that interacts with your database
        // and can check if a migration has been run and mark a migration as run.
        MigrationTable migrationTable = new MigrationTable();

        // Run each migration
        for (Class<? extends Migration> migrationClass : migrationClasses) {
            try {
                // Check if the migration has been run
                if (!migrationTable.hasRun(migrationClass.getSimpleName())) {
                    Migration migration = migrationClass.getDeclaredConstructor().newInstance();
                    migration.up();
                    System.out.println("Ran migration: " + migrationClass.getSimpleName());

                    // Mark the migration as run
                    migrationTable.markAsRun(migrationClass.getSimpleName());
                } else {
                    System.out.println("Skipped migration: " + migrationClass.getSimpleName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
