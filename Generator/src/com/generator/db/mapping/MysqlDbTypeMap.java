package com.generator.db.mapping;

import com.JUtils.base.ValidateHelper;

/**
 * Created by Administrator on 2018/1/9.
 * mysql to java type：https://www.cnblogs.com/waterystone/p/6226356.html
 */
public class MysqlDbTypeMap implements IDbTypeMap {
    @Override
    public String mapJavaType(String sqlType) {
        if (ValidateHelper.isEmptyString(sqlType)) return sqlType;
        sqlType = sqlType.toLowerCase();
        String javaType = "Object";
        switch (sqlType) {
            case "bit":
                javaType = "boolean";
                break;
            case "tinyint":
                javaType = "byte";
                break;
            case "smallint":
                javaType = "short";
                break;
            case "mediumint":
            case "int":
                javaType = "int";
                break;
            case "bigint":
                javaType = "long";
                break;
            case "float":
                javaType = "float";
                break;
            case "decimal":
            case "numeric":
            case "real":
            case "money":
            case "smallmoney":
                javaType = "double";
                break;
            case "varchar":
            case "nvarchar":
            case "char":
            case "nchar":
            case "text":
                javaType = "String";
                break;
            case "datetime":
                javaType = "Date";
                break;
            case "image":
                javaType = "Blod";
                break;
            default:
                javaType = "Object";
                break;
        }

        return javaType;
    }
}
