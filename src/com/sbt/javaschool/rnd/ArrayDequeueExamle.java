package com.sbt.javaschool.rnd;

import java.util.ArrayDeque;
import java.util.ArrayList;


public class ArrayDequeueExamle {
    public static void main(String[] args) {


        ArrayDeque<Person> persons = new ArrayDeque<Person>();


        persons.add(new Person("Alice", 35));
        persons.add(new Person("Bob", 31));
        persons.add(new Person("Tom", 18));
        persons.add(new Person("Masha", 25));
        persons.add(new Person("Dima", 45));


        while (persons.peek()!=null)
            System.out.println(persons.pop());
    }


}