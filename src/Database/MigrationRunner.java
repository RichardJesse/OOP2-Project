
package Database; 

import Database.Migrations.*;
import java.util.Arrays;
import java.util.List;

public class MigrationRunner {
    public static void main(String[] args) {
        // Manually maintain a list of all your migration classes
        List<Class<? extends Migration>> migrationClasses = Arrays.asList(
               
                CreateNumbersTable.class
//            CreateUserTableMigration.class,
//            CreatePostsTableMigration.class
            // Add more migration classes as needed...
        );

        // Run each migration
        for (Class<? extends Migration> migrationClass : migrationClasses) {
            try {
                Migration migration = migrationClass.getDeclaredConstructor().newInstance();
                migration.up();
                System.out.println("Ran migration: " + migrationClass.getSimpleName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
