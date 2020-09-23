package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String url = reader.readLine();
            reader.close();
            String[] mass = url.split("\\?");
            mass = mass[1].split("&");
            ArrayList<String> pars = new ArrayList<>();
            ArrayList<String> objs = new ArrayList<>();
            for (int i = 0; i < mass.length; i++) {
                String[] temp = mass[i].split("=");
                if (temp[0].contains("obj")) {
                    try {

                        objs.add(temp[1]);
                        pars.add(temp[0]);
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }

                } else
                pars.add(temp[0]);
            }

            for (String s : pars) {
                System.out.print(s + " ");
            }
            System.out.println();

            for (String s : objs) {

                try {
                    alert(Double.parseDouble(s));

                } catch (NumberFormatException e) {

                    alert(s);
                }


            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
