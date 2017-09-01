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
    if (index>=count) {
        tail.setNext(node);
        tail=node;
    }else if (index==0){
        node.setNext(head);
        head=node;
    }
    else{
        Node<E> prev_node=head;
        for (int i = 1; i < index; i++)
            prev_node=prev_node.getNext();

        node.setNext(prev_node.getNext());
        prev_node.setNext(node);

    }
    count++;

}
public  E get (int index) {
    Node<E> cursor = head;
    for (int i = 1; i <= index; i++) {
        if (cursor.getNext()==null)
            throw new IndexOutOfBoundsException("index "+index+" out of bounds");
        else
            cursor=cursor.getNext();
    }
    return cursor.getElement();
}

//public  E remove (int index) {}
//public Iterator<E> iterator() {}

//public boolean addAll(Collection<? extends E> c) {}
//public boolean copy(Collection<? super E> c) {}


}