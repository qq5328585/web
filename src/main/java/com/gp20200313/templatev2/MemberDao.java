package com.gp20200313.templatev2;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * 2020/3/13
 * author:ljh
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from person";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setName(rs.getString("username"));
                member.setAge(rs.getInt("age"));
                return member;
            }
        }, null);
    }
}
