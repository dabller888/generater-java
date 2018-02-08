package com.generator.db;

/**
 * Created by Administrator on 2018/1/9.
 */
public class DbTable {
    private String tableName;
    private String schemaName;
    private int rows;
    private boolean hasPrimaryKey;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public boolean getHasPrimaryKey() {
        return hasPrimaryKey;
    }

    public void setHasPrimaryKey(boolean hasPrimaryKey) {
        this.hasPrimaryKey = hasPrimaryKey;
    }
}
