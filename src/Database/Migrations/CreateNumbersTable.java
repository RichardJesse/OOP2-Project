package Database.Migrations;

import Database.Migration;

public class CreateNumbersTable extends Migration {

    @Override
    public void up() {
        String sql = createTable("numbers")
                .id()
                .string("name")
                .build();
        executeStatement(sql);   
        
        System.out.println(sql);
        
// TODO: Add your migration code here
    }

    @Override
    public void down() {
        dropTableIfExists("numbers");
    }
}
