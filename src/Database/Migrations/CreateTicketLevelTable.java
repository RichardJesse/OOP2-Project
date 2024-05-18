package Database.Migrations;
import Database.*;
public class CreateTicketLevelTable  extends Migration {
    @Override
    public void up() {
        String sql = createTable("ticket_level")
            .id()
            .foreignId("event_id").constrained("event").cascadeOnDelete()
            .string("name").notNull()
            .string("price").notNull()
            .timestamps()
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}