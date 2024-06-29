package Seeders;

import Database.Seeder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatabaseSeeder {
    private final List<Class<? extends Seeder>> seederClasses = new ArrayList<>();

    private void addSeeder(Class<? extends Seeder> seederClass) {
        seederClasses.add(seederClass);
    }

    private void runAll() {
        for (Class<? extends Seeder> seederClass : seederClasses) {
            try {
                Seeder seeder = seederClass.getDeclaredConstructor().newInstance();
                seeder.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void runSpecific(String seederName) {
        for (Class<? extends Seeder> seederClass : seederClasses) {
            if (seederClass.getSimpleName().equalsIgnoreCase(seederName)) {
                try {
                    Seeder seeder = seederClass.getDeclaredConstructor().newInstance();
                    seeder.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return;
            }
        }
        System.out.println("Seeder not found: " + seederName);
    }

    public static void main(String[] args) {
        DatabaseSeeder databaseSeeder = new DatabaseSeeder();
        databaseSeeder.addSeeder(UserSeeder.class);
        databaseSeeder.addSeeder(EventOrganizerSeeder.class);
        databaseSeeder.addSeeder(EventSeeder.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command (seed:all or seed:file <SeederName>): ");
        String input = scanner.nextLine().trim();

        if (input.equalsIgnoreCase("seed:all")) {
            databaseSeeder.runAll();
        } else if (input.startsWith("seed:file")) {
            String seederName = input.substring(10).trim(); // Extract seeder name after "seed:file "
            databaseSeeder.runSpecific(seederName);
        } else {
            System.out.println("Invalid command.");
        }

        scanner.close();
    }
}
