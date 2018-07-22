package com.generator.db.helper;

import com.generator.db.DbColumn;
import com.generator.db.DbTable;
import com.generator.db.MysqlHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/21.
 */
public class MysqlDbHelper implements IDbHelper {
    private Connection con = null;
    private PreparedStatement pmt = null;
    private ResultSet result = null;

    @Override
    public List<DbTable> getDbTables(String Schema) {
        List<DbTable> tables = new ArrayList<DbTable>();
        con = MysqlHelper.getConnection();
        StringBuffer sb = new StringBuffer("select t2.TABLE_SCHEMA as schemname,\n" +
                "              t2.TABLE_NAME as tablename,\n" +
                "              t2.TABLE_ROWS as rows,\n" +
                "              t2.TABLE_COMMENT as comment,\n" +
                "              (\n" +
                "                select (case when count(*)>0 then 1 else 0 end)\n" +
                "                from information_schema.TABLE_CONSTRAINTS t1\n" +
                "                join information_schema.KEY_COLUMN_USAGE t2 using (\n" +
                "                    constraint_name,\n" +
                "                    table_schema,\n" +
                "                    table_name\n" +
                "                )\n" +
                "                where t1.constraint_type = 'PRIMARY KEY' and t1.table_schema = 'huanqiu' and t1.TABLE_NAME=t2.TABLE_NAME\n" +
                "              )as primarykey\n" +
                "            from information_schema.TABLES t2\n" +
                "            where t2.TABLE_SCHEMA=?;");

        try {
            pmt = con.prepareStatement(sb.toString());
            pmt.setString(1, Schema);
            result = pmt.executeQuery();
            DbTable table = null;
            while (result.next()) {
                table = new DbTable();
                table.setTableName(result.getString("tablename"));
                table.setLowerTableName(result.getString("tablename"));
                table.setUpperTableName(result.getString("tablename"));
                table.setSchemaName(result.getString("schemname"));
                table.setRows(result.getInt("rows"));
                table.setHasPrimaryKey(result.getBoolean("primarykey"));
                //table.setColumns(this.getTableColumns(result.getString("tablename"),Schema));
                tables.add(table);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            MysqlHelper.Release(result, pmt, con);
        }

        return tables;
    }

    @Override
    public List<DbColumn> getTableColumns(String tableName, String schema) {
        List<DbColumn> columns = new ArrayList<DbColumn>();
        con = MysqlHelper.getConnection();

        StringBuffer sb = new StringBuffer("select t1.ORDINAL_POSITION as ColumnID,\n" +
                "  t1.COLUMN_NAME as ColumnName,\n" +
                "  t1.DATA_TYPE as ColumnType,\n" +
                "  #t1.COLUMN_TYPE,\n" +
                "  (\n" +
                "    select (case when count(*)>0 then 1 else 0 end)\n" +
                "    from INFORMATION_SCHEMA.TABLE_CONSTRAINTS c1,\n" +
                "      information_schema.KEY_COLUMN_USAGE c2\n" +
                "    where\n" +
                "      c1.TABLE_NAME=c2.TABLE_NAME and c1.CONSTRAINT_TYPE='PRIMARY KEY' and\n" +
                "      c1.TABLE_SCHEMA='" + schema + "' and c1.TABLE_NAME='" + tableName + "' and c2.COLUMN_NAME=t1.COLUMN_NAME\n" +
                "  )as IsPrimaryKey,\n" +
                "  (case when t1.IS_NULLABLE='YES' then 1 else 0 end) as IsNullable,\n" +
                "  (case when t1.EXTRA='auto_increment' then 1 else 0 end)as IsIdentity,\n" +
                "  t1.NUMERIC_PRECISION as `Precision`,\n" +
                "  t1.NUMERIC_SCALE as Scale,\n" +
                "  (\n" +
                "      case\n" +
                "          when t1.DATA_TYPE='nvarchar' and t1.CHARACTER_MAXIMUM_LENGTH>0 then t1.CHARACTER_MAXIMUM_LENGTH/2\n" +
                "          when t1.DATA_TYPE='nchar' and t1.CHARACTER_MAXIMUM_LENGTH>0 then t1.CHARACTER_MAXIMUM_LENGTH/2\n" +
                "          when t1.DATA_TYPE='ntext' and t1.CHARACTER_MAXIMUM_LENGTH>0 then t1.CHARACTER_MAXIMUM_LENGTH/2\n" +
                "          else t1.CHARACTER_MAXIMUM_LENGTH\n" +
                "      end\n" +
                "    )as CharLength,\n" +
                "  ifnull(t1.CHARACTER_OCTET_LENGTH,0) as ByteLength,\n" +
                "  t1.COLUMN_COMMENT as Remark\n" +
                "from information_schema.COLUMNS t1\n" +
                "  LEFT JOIN information_schema.TABLES t2 on t2.TABLE_NAME=t1.TABLE_NAME and t2.TABLE_SCHEMA=t1.TABLE_SCHEMA\n" +
                "  LEFT JOIN information_schema.SCHEMATA t3 on t3.SCHEMA_NAME=t1.TABLE_SCHEMA\n" +
                "where t3.SCHEMA_NAME=? and t2.TABLE_NAME=?");
        try {
            pmt = con.prepareStatement(sb.toString());
            pmt.setString(1, schema);
            pmt.setString(2, tableName);
            result = pmt.executeQuery();
            DbColumn column = null;
            while (result.next()) {
                column = new DbColumn();
                column.setColumnID(result.getInt("ColumnID"));
                column.setAsPrimaryKey(result.getBoolean("IsPrimaryKey"));
                column.setColumnName(result.getString("ColumnName"));
                column.setLowerColumnName(result.getString("ColumnName"));
                column.setUpperColumnName(result.getString("ColumnName"));
                column.setColumnType(result.getString("ColumnType"));
                column.setAsType(result.getString("ColumnType"));
                column.setAllowIdentity(result.getBoolean("IsIdentity"));
                column.setAllowNullable(result.getBoolean("IsNullable"));
                column.setByteLength(result.getLong("ByteLength"));
                column.setCharLength(result.getLong("CharLength"));
                column.setScale(result.getInt("Scale"));
                column.setRemark(result.getString("Remark"));
                columns.add(column);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            MysqlHelper.Release(result, pmt, con);
        }

        return columns;
    }

    @Override
    public String getTablePrimaryKeys() {
        return null;
    }
}
