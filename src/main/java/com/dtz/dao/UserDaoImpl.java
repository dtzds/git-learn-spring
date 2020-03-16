package com.dtz.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jt;

    public JdbcTemplate getJt() {
        return jt;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    @Override
    public int addUser() {
        String sql = "INSERT INTO admin VALUES(DEFAULT, ?, ?);";
        int dtz = jt.update(sql, "dtz", "033516");
        System.out.println(dtz);
        return dtz;
    }

    @Override
    public int delUser() {
        return 0;
    }
}
