package Database.Migrations;
import Database.*;
public class CreateEventOrganizerTable  extends Migration {
    @Override
    public void up() {
        String sql = createTable("event_organizer")
            .id()
            .string("name").notNull()
            .string("email").unique()
            .string("password").notNull()
            .string("primary_phone_number").unique().notNull()
            .timestamps()
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}