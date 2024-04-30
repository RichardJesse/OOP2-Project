package Database.Migrations;
import Database.*;public class CreateRandomTable extends Migration {
    @Override
    public void up() {
        String sql = createTable("random")
            .id()
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}