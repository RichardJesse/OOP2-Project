package Database.Migrations;
import Database.*;
public class CreateUsersTable  extends Migration {
    @Override
    public void up() {
        String sql = createTable("users")
            .id()
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}