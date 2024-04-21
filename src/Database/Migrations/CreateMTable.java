package Database.Migrations;
import Database.*;public class CreateMTable extends Migration {
    @Override
    public void up() {
        String sql = createTable("m")
            .id()
            .string("name", 50)
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}