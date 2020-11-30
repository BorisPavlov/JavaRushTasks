package com.javarush.task.task14.task1420;
import java.io.*;
import java.util.*;
/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String sA = reader.readLine();
            String sB = reader.readLine();
            int a = Integer.parseInt(sA);
            int b = Integer.parseInt(sB);
            if ((a <= 0)||(b <= 0)) {
                throw new Exception ("My exception");
            }
            System.out.println(NOD(a, b));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int NOD(int a,int b)
    {
        while(a!=0 && b!=0)
        {
            if(a>=b) a=a%b;
            else b=b%a;
        }
        return a+b;
    }
}



