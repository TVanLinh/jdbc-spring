package DAO;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by linhtran on 28/04/2017.
 */
public class Person {
    private  String name;
    private  int id;
    private  int age;

    public Person() {
    }

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
