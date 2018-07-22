package com.generator.db;

import com.generator.db.mapping.IDbTypeMap;
import com.generator.db.mapping.MysqlDbTypeMap;

/**
 * Created by Administrator on 2018/1/9.
 *
 * 总结：
 * 1. javabean属性命名尽量使用常规的驼峰式命名规则
 * 2. 属性名第一个单词尽量避免使用一个字母：如eBook， eMail。
 * 3. boolean属性名避免使用 “is” 开头的名称
 * 4. 随着jdk， eclipse， spring 等软件版本的不断提高， 底版本的出现的问题可能在高版本中解决了， 低版本原来正常的代码可能在高版本环境下不再支持。
 *
 */
public class DbColumn {
    private int columnID;
    private boolean asPrimaryKey;
    private String columnName;
    private String lowerColumnName;
    private String upperColumnName;
    private String columnType;
    private String asType;
    private long byteLength;
    private long charLength;
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

    public String getLowerColumnName() {
        return lowerColumnName;
    }

    public void setLowerColumnName(String lowerColumnName) {
        this.lowerColumnName = ConfigInfo.toLowerTitle(lowerColumnName);
    }

    public String getUpperColumnName() {
        return upperColumnName;
    }

    public void setUpperColumnName(String upperColumnName) {
        this.upperColumnName = ConfigInfo.toUpperTitle(upperColumnName);
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

    public long getByteLength() {
        return byteLength;
    }

    public void setByteLength(long byteLength) {
        this.byteLength = byteLength;
    }

    public long getCharLength() {
        return charLength;
    }

    public void setCharLength(long charLength) {
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
