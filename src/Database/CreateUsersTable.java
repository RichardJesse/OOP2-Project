package Database;

public class CreateUsersTable extends Migration {

    @Override
    public void up() {
        String sql = createTable("users")
                .string("name", 90)
                .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        dropTableIfExists("users");
    }

}
