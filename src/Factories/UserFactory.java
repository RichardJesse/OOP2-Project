package Factories;

import Database.Factory;
import Models.UserModel;
import Database.Faker;

public class UserFactory extends Factory<UserModel> {
    @Override
    protected UserModel generateModel() {
        System.out.println(Faker.securePassword());
        return new UserModel(Faker.randomName(), Faker.randomEmail(), Faker.randomName(), Faker.securePassword());
    }

    @Override
    protected String getTableName() {
        return "users";
    }

    @Override
    protected String[] getColumns() {
        return new String[]{"display_name", "email", "first_name", "password"};
    }

    @Override
    protected Object[] extractValues(UserModel user) {
        return new Object[]{user.getUsername(), user.getEmail(), user.getFirstName(), user.getPassword()};
    }
}
