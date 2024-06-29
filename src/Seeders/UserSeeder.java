package Seeders;

import Database.Seeder;
import Factories.UserFactory;

import java.sql.SQLException;

public class UserSeeder extends Seeder {
    @Override
    public void run() throws SQLException {
        UserFactory userFactory = new UserFactory();
        userFactory.create(4);
    }
}
