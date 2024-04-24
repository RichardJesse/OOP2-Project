package Database.Migrations;
import Database.*;public class CreateChairTable extends Migration {
    @Override
    public void up() {
        String sql = createTable("chair")
            .id()
            .foreignId("chair_user").constrained("users").cascadeOnDelete()
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}