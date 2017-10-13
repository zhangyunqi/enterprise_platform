package com.cars.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Person
 */
@Entity
@Table(name = "person", catalog = "zyqtest")
public class Person implements java.io.Serializable {

    private String guid;
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String guid) {
        this.guid = guid;
    }

    public Person(String guid, String name, Integer age) {
        this.guid = guid;
        this.name = name;
        this.age = age;
    }

    @Id

    @Column(name = "guid", unique = true, nullable = false, length = 40)
    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Column(name = "name", length = 20)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age")
    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
