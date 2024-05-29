package Database.Migrations;

import Database.*;

public class CreateUsersTable extends Migration {

    @Override
    public void up() {
        String sql = createTable("users")
                .id()
                .string("first_name").notNull()
                .string("middle_name")
                .string("display_name").unique()
                .string("password")
                .string("email").unique()
                .timestamps()
                .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}
