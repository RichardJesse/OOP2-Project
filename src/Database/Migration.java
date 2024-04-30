package Database;

import java.sql.Connection;
import LessJava.*;
import java.sql.Statement;

public abstract class Migration {
    
    OutputHelper output = new OutputHelper();

    protected Connection connection;

    public Migration() {
        DatabaseConnection dbConnection = new DatabaseConnection();
        this.connection = dbConnection.connection;
    }

    public abstract void up();

    public abstract void down();

    protected void executeStatement(String sql) {
        try {
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected Table createTable(String name) {
        return new Table(name);
    }

    protected void addColumn(String tableName, String columnName, String dataType) {
       
        String sql = "ALTER TABLE "+ tableName +" ADD COLUMN "+ columnName + dataType;
        output.print(columnName);
        
        output.print(sql);
        executeStatement(sql);
    }

    protected void dropTableIfExists(String tableName) {
        String sql = "DROP TABLE IF EXISTS " + tableName;
        executeStatement(sql);
    }

    public static class Table {

        private final String name;
        private final StringBuilder sql = new StringBuilder();

        public Table(String name) {
            this.name = name;
            sql.append("CREATE TABLE ").append(name).append(" (");
        }

        public Table addColumn(String columnName) {
            sql.append(" ADD COLUMN ").append(columnName);
            return this;
        } 

        public Table string(String columnName, Integer... length) {
            int len = (length.length > 0) ? length[0] : 255;
            sql.append(columnName).append(" VARCHAR(").append(len).append("), ");
            return this;
        }
        
        public Table foreignId(String columnName){
            sql.append("FOREIGN KEY").append("(").append(columnName).append(")").append("");
            return this;
        }
        
        public Table constrained(String tableName){
            sql.append("ReferencedTableName").append("(").append(tableName).append(")").append("");
            return this;
        }
        
        public Table cascadeOnDelete(){
            sql.append("ON DELETE CASCADE").append("");
            return this;
        }

        public Table id() {
            sql.append("id INT NOT NULL AUTO_INCREMENT PRIMARY KEY , ");
            return this;
        }

        public Table integer(String columnName) {
            sql.append(columnName).append(" INT, ");
            return this;
        }
        
        public Table text(){
            sql.append("TEXT").append("");
            return this;
        }

        public Table bigInteger(String columnName) {
            sql.append(columnName).append(" BIGINT, ");
            return this;
        }

        public Table smallInt(String columnName) {
            sql.append(columnName).append(" SMALLINT, ");
            return this;
        }

        public Table tinyInt(String columnName) {
            sql.append(columnName).append(" TINYINT, ");
            return this;
        }

        public Table floatType(String columnName) {
            sql.append(columnName).append(" FLOAT, ");
            return this;
        }

        public Table doubleType(String columnName) {
            sql.append(columnName).append(" DOUBLE, ");
            return this;
        }

        public Table decimal(String columnName, int precision, int scale) {
            sql.append(columnName).append(" DECIMAL(").append(precision).append(",").append(scale).append("), ");
            return this;
        }

        public Table booleanType(String columnName) {
            sql.append(columnName).append(" BOOLEAN, ");
            return this;
        }

        public Table date(String columnName) {
            sql.append(columnName).append(" DATE, ");
            return this;
        }

        public Table time(String columnName) {
            sql.append(columnName).append(" TIME, ");
            return this;
        }

        public Table timestamp(String columnName) {
            sql.append(columnName).append(" TIMESTAMP, ");
            return this;
        }

        public Table timestamps() {
            sql.append(" created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,\n"
                    + "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP");

            return this;
        }

        public Table charType(String columnName, int length) {
            sql.append(columnName).append(" CHAR(").append(length).append("), ");
            return this;
        }

        public Table text(String columnName) {
            sql.append(columnName).append(" TEXT, ");
            return this;
        }

        public Table blob(String columnName) {
            sql.append(columnName).append(" BLOB, ");
            return this;
        }

        public String build() {
            // Remove trailing comma and space, add closing parenthesis
            sql.setLength(sql.length() - 2);
            sql.append(");");
            return sql.toString();
        }

    }

}
