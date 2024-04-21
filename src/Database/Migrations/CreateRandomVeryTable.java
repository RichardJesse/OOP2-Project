package Database.Migrations;
import Database.*;public class CreateRandomVeryTable extends Migration {
    @Override
    public void up() {
        String sql = createTable("random_very")
            .id()
           
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}