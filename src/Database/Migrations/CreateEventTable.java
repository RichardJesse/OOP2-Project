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
            .Enum("Genre", "coporate, adventure, concert")
            .string("avaliable_tickets").notNull()
            .text("event_description")
            .string("event_poster_path")
            .timestamp("start_time").notNull()
            .timestamp("end_date").notNull()
            .build();
        executeStatement(sql);
        System.out.println(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}