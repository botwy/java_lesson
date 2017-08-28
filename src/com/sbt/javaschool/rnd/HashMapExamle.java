package com.sbt.javaschool.rnd;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;


public class HashMapExamle {
    public static void main(String[] args) {


        Map<String, Person> persons = new HashMap<String, Person>();


        persons.put("a", new Person("Alice", 35));
        persons.put("b", new Person("Bob", 31));
        persons.put("t", new Person("Tom", 18));
        persons.put("m", new Person("Masha", 25));
        persons.put("d", new Person("Dima", 45));


        for (Map.Entry<String, Person> item : persons.entrySet()
                ) {
            System.out.println(item.getKey() + " " + item.getValue().getName());
        }
    }


}