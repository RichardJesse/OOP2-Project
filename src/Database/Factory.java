/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.QueryBuilder;
import java.sql.*;

/**
 *
 * @author user
 */
public abstract class Factory<T> {
    
    protected abstract T generateModel();

    protected abstract String getTableName();

    protected abstract String[] getColumns();

    public void create(int count) {
        for (int i = 0; i < count; i++) {
            T model = generateModel();
            insertIntoDatabase(model);
        }
    }

    private void insertIntoDatabase(T model) {
        QueryBuilder query = new QueryBuilder();
        query.insert(getTableName(), getColumns());
        query.values(extractValues(model));
        try {
            query.build().execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected abstract Object[] extractValues(T model);
    
    
    
}
