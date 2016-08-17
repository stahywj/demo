package Bean;

import java.sql.Blob;

/**
 * Created by kenneth on 2016/7/28.
 */
public class Person {
    private int id;
    private String name;
    private int age;
    private Address address;
    private Blob picture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public Blob getPicture() {
        return picture;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
