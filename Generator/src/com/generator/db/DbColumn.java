package com.generator.db;

import com.generator.db.mapping.IDbTypeMap;
import com.generator.db.mapping.MysqlDbTypeMap;

/**
 * Created by Administrator on 2018/1/9.
 */
public class DbColumn {
    private int columnID;
    private boolean asPrimaryKey;
    private String columnName;
    private String columnType;
    private String asType;
    private int byteLength;
    private int charLength;
    private int scale;
    private boolean allowIdentity;
    private boolean allowNullable;
    private String remark;

    public int getColumnID() {
        return columnID;
    }

    public void setColumnID(int columnID) {
        this.columnID = columnID;
    }

    public boolean isAsPrimaryKey() {
        return asPrimaryKey;
    }

    public void setAsPrimaryKey(boolean asPrimaryKey) {
        this.asPrimaryKey = asPrimaryKey;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getAsType() {
        return asType;
    }

    public void setAsType(String asType) {
        IDbTypeMap map = new MysqlDbTypeMap();
        this.asType = map.mapJavaType(columnType);
    }

    public int getByteLength() {
        return byteLength;
    }

    public void setByteLength(int byteLength) {
        this.byteLength = byteLength;
    }

    public int getCharLength() {
        return charLength;
    }

    public void setCharLength(int charLength) {
        this.charLength = charLength;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public boolean isAllowIdentity() {
        return allowIdentity;
    }

    public void setAllowIdentity(boolean allowIdentity) {
        this.allowIdentity = allowIdentity;
    }

    public boolean isAllowNullable() {
        return allowNullable;
    }

    public void setAllowNullable(boolean allowNullable) {
        this.allowNullable = allowNullable;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
