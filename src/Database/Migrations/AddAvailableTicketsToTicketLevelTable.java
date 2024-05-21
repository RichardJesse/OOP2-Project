package Database.Migrations;
import Database.*;
public class AddAvailableTicketsToTicketLevelTable  extends Migration {
    @Override
    public void up() {
      addColumn("ticket_level", "available_tickets", "VARCHAR(255)");
         }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}