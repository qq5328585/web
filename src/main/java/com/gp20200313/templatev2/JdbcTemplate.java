package com.gp20200313.templatev2;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 2020/3/13
 * author:ljh
 */
public class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public final List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        try {
            Connection conn = this.getConnection();
            PreparedStatement pstm = this.createPrepareStatement(conn, sql);
            ResultSet rs = this.executeQuery(pstm, values);
            List<?> result = this.parseResultSet(rs, rowMapper);
            rs.close();
            pstm.close();
            conn.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception{
        List<Object> result = new ArrayList<Object>();
        int rowNum = 0;
        while(rs.next()) {
            result.add(rowMapper.mapRow(rs, rowNum));
        }
        return result;
    }

    private ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws SQLException{
        for(int i = 0; i < values.length; i++) {
            pstm.setObject(i, values[i]);
        }
        return pstm.executeQuery();
    }

    private PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
