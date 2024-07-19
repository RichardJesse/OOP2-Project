package Database.Migrations;

import Database.*;

public class AddPhoneNumberToUsersTable extends Migration {

    @Override
    public void up() {
        addColumn("users", "phone_number" , "VARCHAR(255)");
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}
