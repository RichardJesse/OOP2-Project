package Database;

public class MigrationNameParser {

    public String getTableName(String migrationName) {
        String strippedName = migrationName.replace("Create", "").replace("Table", "");
        return camelToSnake(strippedName);
    }

    public String[] getColumnNameAndTableName(String migrationName) {
        if (migrationName.startsWith("Add") && migrationName.contains("To")) {
            String[] parts = migrationName.split("To");
            String columnName = camelToSnake(parts[0].replace("Add", ""));
            String tableName = getTableName(parts[1] + "Table");
            return new String[]{columnName, tableName};
        }
        return new String[]{null, null};
    }

    private String camelToSnake(String str) {
        // Convert camel case to snake case
        StringBuilder builder = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                if (builder.length() > 0) {
                    builder.append('_');
                }
                builder.append(Character.toLowerCase(c));
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
