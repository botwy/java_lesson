package com.sbt.javaschool.rnd;

import java.util.*;

public class Main {
    public static void main(String[] args) {


      //  Map<String,Person> persons = new HashMap<>();
        List<Person> persons = new ArrayList();

      //  persons.put("bob", new Person("Bob",32));
        persons.add(new Person("Alice", 35));

        persons.add(1,new Person("Bob",1));
        persons.add(1,new Person("Tom",18));
        persons.set(1,new Person("Dik",2));
       // System.out.println(persons.get("bob"));

        Iterator<Person> personIterator=persons.iterator();
        while(personIterator.hasNext()) {
        System.out.println(personIterator.next());
        }

    //    for(Iterator<Person> i = persons.iterator(); i.hasNext();)
      //      System.out.println(i);

    //    for (Person person:persons)
      //      System.out.println(person);

      //  for (int i = 0; i < persons.size(); i++)
        //    System.out.println(persons.get(i));


//        System.out.println(persons.get(5));


       // System.out.println( persons.pollLast());
//Collections.sort(persons, Person.byNameComparator);



    }


}