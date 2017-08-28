package com.sbt.javaschool.rnd;

import java.util.ArrayList;


public class ArrayListExamle {
    public static void main(String[] args) {


        ArrayList<Person> persons = new ArrayList();

        persons.add(new Person("Alice", 35));
        persons.add(new Person("Bob", 31));
        persons.add(new Person("Tom", 18));
        persons.add(new Person("Masha", 25));
        persons.add(new Person("Dima", 45));


        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }


}