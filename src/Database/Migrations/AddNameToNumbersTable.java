package Database.Migrations;

import Database.*;
public class AddNameToNumbersTable extends Migration {
    @Override
    public void up() {
          addColumn("numbers", "name", "VARCHAR");
        
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}