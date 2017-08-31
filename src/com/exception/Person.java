package com.exception;

import java.io.IOException;

public class Person {
    String name;
    Integer age;
    Gender gender;
    Person spouse;

    public Person(String name, Integer age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Person getSpouse() {
        return spouse;
    }

    public  void marry (Person person) throws IOException {
        if (person==this || this.getGender()==person.getGender())
            throw new IOException("Gender is not equal");

        person.setSpouse(this);
        this.setSpouse(person);
    }
}
