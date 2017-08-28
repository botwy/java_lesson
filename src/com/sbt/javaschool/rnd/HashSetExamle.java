package com.sbt.javaschool.rnd;

import java.util.HashSet;
import java.util.LinkedList;


public class HashSetExamle {
    public static void main(String[] args) {


        HashSet<Person> persons = new HashSet<Person>();

        persons.add(new Person("Alice", 35));
        persons.add(new Person("Bob", 31));
        persons.add(new Person("Tom", 18));
        persons.add(new Person("Masha", 25));
        persons.add(new Person("Dima", 45));




        System.out.println("For each ------------------------------");
        for (Person person:persons) {
            System.out.println(person);
        }
    }


}