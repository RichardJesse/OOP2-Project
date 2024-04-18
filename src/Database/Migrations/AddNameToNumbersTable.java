package Database.Migrations;
public class AddNameToNumbersTable extends Migration {
    @Override
    public void up() {
        String sql = addColumn("numbers", "name");
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}