/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class TestClass {

    public static void main(String[] args) throws SQLException {

        QueryBuilder qb = new QueryBuilder();
        DatabaseOperations Data0 = new DatabaseOperations();
        
       
        
         PreparedStatement statement = qb.insert("users", "username" , "password" , "account_number").values("jesse", "123" ,"800").build();
         statement.execute();
  

      
    }

}
