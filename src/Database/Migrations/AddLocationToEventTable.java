/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.Migrations;
import Database.*;

/**
 *
 * @author user
 */
public class AddLocationToEventTable extends Migration  {
    
     @Override
    public void up() {
      addColumn("event", "location", "TEXT");
         }

    @Override
    public void down() {
        // TODO: Add your rollback code here
    }
    
    
}
