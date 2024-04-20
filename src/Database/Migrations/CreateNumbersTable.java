package Database.Migrations;
import Database.*;public class CreateNumbersTable extends Migration {
    @Override
    public void up() {
        String sql = createTable("numbers")
            .id()
            .string("name")
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}