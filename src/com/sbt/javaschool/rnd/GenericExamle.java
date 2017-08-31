package com.sbt.javaschool.rnd;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


public class GenericExamle {
    public static void main(String[] args) {

        //contrvariantnost and covariantn
        //PECS Producer extends Consumer super
        //Generic podstavlyautsa na etape compelazii
        //Esli peremennie nugno i chitat i pisat to luchshe ne ispolzovat masku
        //src, dest, io
        List<? super Number> list = new ArrayList<>();
        list.add(new Integer(5));

        List<? extends Number> list2 = new ArrayList<Number>();
        Number num = list2.get(0);

        //      List<? extends Number> list3=new ArrayList<Integer>();
        //    Integer num2 = list2.get(0);

        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);

        List<? super Number> list5 = new ArrayList<>();
    }

   // public static void copyList(List<>)


}