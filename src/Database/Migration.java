package Database;

import java.sql.Connection;
import java.sql.Statement;

public abstract class Migration {

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

    public static class Table {

        private final String name;
        private final StringBuilder sql = new StringBuilder();

        public Table(String name) {
            this.name = name;
            sql.append("CREATE TABLE ").append(name).append(" (");
        }

        public Table string(String columnName, int length) {
            sql.append(columnName).append(" VARCHAR(").append(length).append("), ");
            return this;
        }

        public Table integer(String columnName) {
            sql.append(columnName).append(" INT, ");
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

