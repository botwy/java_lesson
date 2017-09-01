package com.sbt.javaschool.rnd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainMyLinkList {
    public static void main(String[] args) {

MyLinkedList<Person> link_list =  new MyLinkedList<Person>();
link_list.add(new Person("Dima",35));
link_list.add(new Person("Sasha",29));
link_list.add(new Person("Masha",18));

System.out.println(link_list.get(0));

    }


}