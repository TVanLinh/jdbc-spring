package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by linhtran on 28/04/2017.
 */

@Repository
@Scope(scopeName ="prototype")
public class PersonIML implements PersonDAO {
    @Autowired
    JDBC jdbc;

    @Override
    public List<Person> getAllPerson() {
        return null;
    }

    public JDBC getJdbc() {
        return jdbc;
    }

    public void setJDBC(JDBC jdbc)
    {
        this.jdbc=jdbc;
    }

    public void insert(Person person) {
        String sql="insert into person(name, age) values(?,?)";
        jdbc.getJdbcTemplate().update(sql,new Object[]{person.getName(),person.getAge()});
     }

}
