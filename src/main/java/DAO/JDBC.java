package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.inject.Named;
import javax.sql.DataSource;

/**
 * Created by linhtran on 28/04/2017.
 */

public class JDBC {

    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public DataSource getDataSource() {
        return dataSource;
    }
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
