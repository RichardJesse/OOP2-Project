package Database.Migrations;
import Database.*;public class CreateCVTable extends Migration {
    @Override
    public void up() {
        String sql = createTable("c_v")
            .id()
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}