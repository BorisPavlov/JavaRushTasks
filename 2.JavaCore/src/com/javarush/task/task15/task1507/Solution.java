package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m) {
        System.out.println("Метод 3");
    }
    public static void printMatrix(short m) {
        System.out.println("Метод 4");
    }
    public static void printMatrix(boolean m) {
        System.out.println("Метод 5");
    }
    public static void printMatrix(byte m) {
        System.out.println("Метод 6");
    }
    public static void printMatrix(long m) {
        System.out.println("Метод 7");
    }
    public static void printMatrix(float m) {
        System.out.println("Метод 8");
    }
    public static void printMatrix(double m) {
        System.out.println("Метод 9");
    }
    public static void printMatrix(char m) {
        System.out.println("Метод 10");
    }

}
