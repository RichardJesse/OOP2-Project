package Database.Migrations;
import Database.*;public class CreateMigrationsTable extends Migration {
    @Override
    public void up() {
        String sql = createTable("migrations")
            .id()
           .string("migration_class")
            .build();
        executeStatement(sql);
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}