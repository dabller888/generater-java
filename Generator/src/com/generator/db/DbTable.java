package com.generator.db;

import java.util.List;

/**
 * Created by Administrator on 2018/1/9.
 */
public class DbTable {
    private String tableName;
    private String lowerTableName;
    private String upperTableName;
    private String schemaName;
    private int rows;
    private boolean hasPrimaryKey;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getLowerTableName() {
        return lowerTableName;
    }

    public void setLowerTableName(String lowerTableName) {
        this.lowerTableName = ConfigInfo.toLowerTitleByClass(lowerTableName);
    }

    public String getUpperTableName() {
        return upperTableName;
    }

    public void setUpperTableName(String upperTableName) {
        this.upperTableName = ConfigInfo.toUpperTitleByClass(upperTableName);
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
