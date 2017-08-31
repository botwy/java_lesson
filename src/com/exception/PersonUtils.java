package com.exception;

import org.omg.CORBA.portable.ApplicationException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonUtils {
    public static final Person BOB = new Person("Bob", 32, Gender.MALE);

    public static final Person DIMA = new Person("Dima", 32, Gender.MALE);

    public static void merry(Person person1, Person person2) throws Exception {
        try {
            person1.marry(person2);
        } catch (IOException e) {
           throw new Exception("",e);
        }
     // catch (Exception e) {
       //     e.printStackTrace();
      //  }
    }
/**
    public static void personSerialize(String filename, Person person) throws IOException {
        try(
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(person);
        }
    }
 */

}
