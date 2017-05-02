package DAO;

import java.util.List;

/**
 * Created by linhtran on 28/04/2017.
 */
public interface PersonDAO
{
    List<Person> getAllPerson();
    void insert(Person person);

}
