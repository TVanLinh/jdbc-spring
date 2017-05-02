package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by linhtran on 28/04/2017.
 */

@Repository
@Scope(scopeName ="prototype")
public class DepartmentIML implements DepartmentDAO {

    @Autowired
    JDBC jdbc;

    @Override
    public Boolean insert(Department department) {
        String query="insert into department(name) values(?)";
        try
        {
            System.out.println(jdbc.getJdbcTemplate());
            if(jdbc.getJdbcTemplate().update(query,new Object[]{department.getName()})>0)
            {
                return true;
            }
        }catch (Exception e)
        {
            return  false;
        }
        return false;
    }

    @Override
    public int getCount() {
        String query="select count(*) from department";
        return  jdbc.getJdbcTemplate().queryForObject(query,Integer.class);
    }

    @Override
    public List<Department> getAlls() {
        String query=" select  * from department limit 0,1";
        return jdbc.getJdbcTemplate().query(query,new DepartMapping());
    }

    public static  final class  DepartMapping implements RowMapper
    {
        @Override
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Department department=new Department();
            department.setId(rs.getInt("id"));
            department.setName(rs.getString("name"));
            return department;
        }
    }
}
