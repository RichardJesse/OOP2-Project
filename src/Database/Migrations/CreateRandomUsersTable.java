package Database.Migrations;
import Database.*;public class CreateRandomUsersTable extends Migration {
    @Override
    public void up() {
        String sql = createTable("random_users")
            .id()
            .string("random_users_name")
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}