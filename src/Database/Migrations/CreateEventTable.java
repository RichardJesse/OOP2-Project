package Database.Migrations;
import Database.*;
public class CreateEventTable  extends Migration {
    @Override
    public void up() {
        String sql = createTable("event")
            .id()
            .foreignId("event_organizer_id")
                .constrained("event_organizer")
                .cascadeOnDelete()
            .string("event_name")
                .unique()
                .notNull()
            .string("avaliable_tickets").notNull()
            .text("event_description")
            .string("event_poster_path")
            .timestamps() 
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}