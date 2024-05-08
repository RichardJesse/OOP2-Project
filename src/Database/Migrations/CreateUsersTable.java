package Database.Migrations;
import Database.*;
public class CreateUsersTable  extends Migration {
    @Override
    public void up() {
        String sql = createTable("users")
            .id()
            .string("first_name")
            .string("middle_name")
            .string("display_name")
            .string("password")
            .string("email")
            .timestamps()
            .build();
        executeStatement(sql);
        
        System.out.print(sql);
        
     
    }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
}