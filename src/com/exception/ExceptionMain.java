package com.exception;

import java.io.IOException;

public class ExceptionMain {
    static void exec1(Number number) {
        try {
            System.out.println(1/number.intValue());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void exec2(Number number) {
        exec1(number);

    }
    public static  void  main(String[] args) {
     //   Integer i=0;
       // exec2(i);


        try {
            PersonUtils.merry(PersonUtils.BOB,PersonUtils.DIMA);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //System.out.println("tut");
        /**
        try {
            PersonUtils.personSerialize("C:\\Temp\1.txt",PersonUtils.BOB);
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
    }
}
