package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        Collections.addAll(exceptions,
                new ArrayStoreException(),
                new NullPointerException(),
                new NumberFormatException(),
                //new ArithmeticException(),
                new ArrayIndexOutOfBoundsException (),
                new EmptyStackException(),
                new IllegalStateException(),
                new IllegalThreadStateException(),
                new NegativeArraySizeException(),
                new SecurityException());
    }
}
