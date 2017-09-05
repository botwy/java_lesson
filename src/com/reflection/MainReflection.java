package com.reflection;

import sun.plugin.javascript.navig.Array;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainReflection {

    public  static void main (String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        IClient cl = new Client("GroupA", 1);
        Class clazz = cl.getClass();
        System.out.println(clazz.getName());
        //Class.forName
        //Client.class String tochka class

        List<Method> methods = Arrays.asList(clazz.getMethods());

          //  System.out.println(methods);

        List<Method> methods_priv = Arrays.asList(clazz.getDeclaredMethods());

        System.out.println(methods_priv);
        List<Field> fields = Arrays.asList(clazz.getDeclaredFields());
        for (Field f:fields
             ) {
            System.out.println(f);
        }

        Method method = clazz.getMethod("getGroupName");
       // method.invoke(cl);
        System.out.println(method.invoke(cl).getClass());

        Field field = clazz.getDeclaredField("loyality");
       // field.setAccessible(true);
        field.set(cl, Integer.valueOf(1));

      //  Client cl2 = Client.class.getConstructor(String.class, Integer.class)
        List<String> list = new ArrayList<>();
        clazz = list.getClass();
    //    ParameterizedType type = (ParameterizedType) clazz.getGenericSuperclass();

        System.out.println(clazz);

        System.out.println((new StringList()).getClass().getSuperclass());

        //Fabrica
        List<String> strings = (List<String>)
                Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                        new Class[]{List.class},new LogHandler(new ArrayList<String>()));

        for (String str:strings
             ) {
            System.out.println(str);
        }
    }
}
