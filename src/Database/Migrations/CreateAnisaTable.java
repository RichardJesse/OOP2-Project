package Database.Migrations;
import Database.*;
public class CreateAnisaTable  extends Migration {
    @Override
    public void up() {
        String sql = createTable("anisa")
            .id()
            .string("name").notNull().unique()
            .integer("phone_number").unique()
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}