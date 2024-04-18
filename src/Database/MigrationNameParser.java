/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;




public class MigrationNameParser {
    
    public String getTableName(String migrationName) {
        String strippedName = migrationName.replace("Create", "").replace("Migration", "").replace("Table", "");
        String tableName = Character.toLowerCase(strippedName.charAt(0)) + strippedName.substring(1);
        return tableName;
    }

    public String[] getColumnNameAndTableName(String migrationName) {
        if (migrationName.startsWith("Add") && migrationName.contains("To")) {
            String[] parts = migrationName.split("To");
            String columnName = parts[0].replace("Add", "").toLowerCase();
            String tableName = getTableName(parts[1] + "Table");
            return new String[]{columnName, tableName};
        }
        return new String[]{null, null};
    }
}


