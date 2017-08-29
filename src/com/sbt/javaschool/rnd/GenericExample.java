package com.sbt.javaschool.rnd;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static javafx.scene.input.KeyCode.T;


public class GenericExample {
    public static void main(String[] args) {

//contrvariantnost and covariantn
        //PECS Producer extends Consumer super
        //Generic podstavlyautsa na etape compelazii
        //Esli peremennie nugno i chitat i pisat to luchshe ne ispolzovat masku
        //src, dest, io
        List<Number> list = new ArrayList<>();
        list.add(new Integer(5));
        list.add(new Float(1.1f));
        list.add(new Double(2.2f));

    //    List<? extends Number> list2 = new ArrayList<Number>();
    //    Number num = list2.get(0);

        //      List<? extends Number> list3=new ArrayList<Integer>();
        //    Integer num2 = list2.get(0);


        List<Number> list2 = new ArrayList<>();
        list2.add(new Integer(105));
        list2.add(new Float(101.1f));
        list2.add(new Double(102.2f));

List<Integer> list3=new ArrayList<>();
        list3.add(new Integer(5));
        list3.add(new Integer(1));
        list3.add(new Integer(2));



        List<? super Number> list5 = new ArrayList<>();
        list5.add(new Integer(5));
        list5.add(new Float(1.1f));
        list5.add(new Double(2.2f));
list5.get(0);
        List<? extends Integer> list6;
        list6=list3;
       // list6.add(new Integer(1));
        list6.get(0);
      copyList(list2,list);

       //copyList(list2,list3);

      //  Collections.copy(list2,list3);
        for (Number num:list) {
            System.out.println(num);
        }


    }

    public static <T> void copyList (List<? super T> dest, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++)
            dest.set(i,src.get(i));

    }


}