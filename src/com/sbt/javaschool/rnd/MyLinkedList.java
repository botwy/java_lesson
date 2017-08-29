package com.sbt.javaschool.rnd;

import java.util.ArrayList;
import java.util.List;


public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int count;

public void add (T data){
Node<T> node = new Node<T>(data);
if (head == null) {
   tail=node;
}else{
    tail.setNext(node);
}

tail = node;
count++;
}

}