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
        String sql = "ALTER TABLE " + tableName + " ADD COLUMN " + columnName + " " + dataType;
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
        private boolean isFirstColumn = true;

        public Table(String name) {
            this.name = name;
            sql.append("CREATE TABLE ").append(name).append(" (");
        }

        private Table addColumnDefinition(String definition) {
            if (!isFirstColumn) {
                sql.append(", ");
            } else {
                isFirstColumn = false;
            }
            sql.append(definition);
            return this;
        }

        public Table string(String columnName, Integer... length) {
            int len = (length.length > 0) ? length[0] : 255;
            return addColumnDefinition(columnName + " VARCHAR(" + len + ")");
        }

        public Table foreignId(String columnName) {
            return addColumnDefinition(columnName + " INT, FOREIGN KEY (" + columnName + ")");
        }

        public Table unique() {
            sql.append(" UNIQUE");
            return this;
        }
        
        public Table autoIncrement(){
            sql.append("AUTO_INCREMENT");
            return this;
        }

        public Table notNull() {
            sql.append(" NOT NULL");
            return this;
        }

        public Table constrained(String tableName) {
            sql.append(" REFERENCES ").append(tableName).append("(id)");
            return this;
        }

        public Table cascadeOnDelete() {
            sql.append(" ON DELETE CASCADE");
            return this;
        }

        public Table id() {
            return addColumnDefinition("id INT NOT NULL AUTO_INCREMENT PRIMARY KEY");
        }

        public Table integer(String columnName) {
            return addColumnDefinition(columnName + " INT");
        }

        public Table text(String columnName) {
            return addColumnDefinition(columnName + " TEXT");
        }

        public Table bigInteger(String columnName) {
            return addColumnDefinition(columnName + " BIGINT");
        }

        public Table smallInt(String columnName) {
            return addColumnDefinition(columnName + " SMALLINT");
        }

        public Table tinyInt(String columnName) {
            return addColumnDefinition(columnName + " TINYINT");
        }

        public Table floatType(String columnName) {
            return addColumnDefinition(columnName + " FLOAT");
        }

        public Table doubleType(String columnName) {
            return addColumnDefinition(columnName + " DOUBLE");
        }

        public Table decimal(String columnName, int precision, int scale) {
            return addColumnDefinition(columnName + " DECIMAL(" + precision + "," + scale + ")");
        }

        public Table booleanType(String columnName) {
            return addColumnDefinition(columnName + " BOOLEAN");
        }

        public Table date(String columnName) {
            return addColumnDefinition(columnName + " DATE");
        }

        public Table time(String columnName) {
            return addColumnDefinition(columnName + " TIME");
        }

        public Table timestamp(String columnName) {
            return addColumnDefinition(columnName + " TIMESTAMP");
        }

        public Table timestamps() {
            return addColumnDefinition("created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, " +
                    "updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP");
        }

        public Table charType(String columnName, int length) {
            return addColumnDefinition(columnName + " CHAR(" + length + ")");
        }

        public Table blob(String columnName) {
            return addColumnDefinition(columnName + " BLOB");
        }

        public String build() {
            sql.append(");");
            return sql.toString();
        }
    }
}
