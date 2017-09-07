package com.class_loader;

import com.sbt.javaschool.rnd.Person;
import sun.misc.Launcher;

import java.lang.reflect.Array;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

public class MainClassLoader {

    public static void main (String[] args) {
        //Map указываем что наш класс лоудер загружает класс без обращения к родителям
        Person person = new Person("Bob", 35);
        Launcher launcher = new Launcher();
        //Алексей Пандин
        //Антон Архипов Грабли Класслоудер
     //   System.out.println(
       // Arrays.toString(
       URL[] arr_url =((URLClassLoader)launcher.getClassLoader()).getURLs();
        for (int i = 0; i <arr_url.length ; i++) {
            System.out.println(arr_url[i]);
        }

     //   );


    }
}
