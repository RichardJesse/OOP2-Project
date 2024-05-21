package Database.Migrations;
import Database.*;
public class AddLocationToEventTable  extends Migration {
    @Override
    public void up() {
      addColumn("event", "location", "TEXT");
         }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}