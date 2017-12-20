package com.pg.alert.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.PersistenceContext;

/**
 * @Author: XieHaijun
 * @Description:
 * @Date: Created in 10:16 2017/12/20
 * @Modified By
 */

public class UserDaoImpl implements UserDaoCustom{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Map<String, Object>> queryData() {
        String sql = "SELECT t.* FROM T_USER t";

        return jdbcTemplate.queryForList(sql);
    }
}
