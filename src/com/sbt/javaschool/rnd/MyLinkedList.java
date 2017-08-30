package com.sbt.javaschool.rnd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class MyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int count;

public void add (E element){
Node<E> node = new Node<E>(element);
if (head == null) {
   head=node;
}else{
    tail.setNext(node);
}

tail = node;
count++;
}
public void add (int index, E element){
    Node<E> node = new Node<E>(element);
    if (head==null)
        head=node;
    else if (index>count) {
        tail.setNext(node);
        tail=node;
    }else{
        Node<E> findNode=head;
        for (int i = 1; i < index; i++) {
            findNode=findNode.getNext();
        }
        node.setNext(findNode.getNext());
        findNode.setNext(node);

    }
    count++;

}
public  E get (int index) {}
public  E remove (int index) {}
public Iterator<E> iterator() {}

public boolean addAll(Collection<? extends E> c) {}
public boolean copy(Collection<? super E> c) {}


}