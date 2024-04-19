package Database.Migrations;
import Database.*;public class AddAgeToUsersTable extends Migration {
    @Override
    public void up() {
      addColumn("users", "age");
         }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}