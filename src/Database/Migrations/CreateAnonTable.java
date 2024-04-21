package Database.Migrations;
import Database.*;public class CreateAnonTable extends Migration {
    @Override
    public void up() {
        String sql = createTable("anon")
            .id()
            
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}