package Database.Migrations;
import Database.*;
public class CreatePaymentsTable  extends Migration {
    @Override
    public void up() {
        String sql = createTable("payments")
            .id()
            .string("method")
            .foreignId("user_id").constrained("users").cascadeOnDelete()
            .string("amount")
            .timestamps()
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}