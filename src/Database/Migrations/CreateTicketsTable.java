package Database.Migrations;
import Database.*;
public class CreateTicketsTable  extends Migration {
    @Override
    public void up() {
        String sql = createTable("tickets")
            .id()
            .foreignId("user_id").constrained("users").cascadeOnDelete()
            .foreignId("event_id").constrained("event").cascadeOnDelete()
            .string("ticket_number").unique().notNull()
            .timestamps()
            .build();
        executeStatement(sql);
        
        System.out.println(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}