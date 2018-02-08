package com.generator.db.helper;

import java.util.List;

import com.generator.db.DbColumn;
import com.generator.db.DbTable;

/**
 * Created by Administrator on 2018/1/9.
 */
public interface IDbHelper {
    List<DbTable> getDbTables(String TableName);
    List<DbColumn> getTableColumns(String tableName, String schema);
    String getTablePrimaryKeys();
}
