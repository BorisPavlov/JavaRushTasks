package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут

        // В Java есть простейший анализатор кода, который не позволяет выкидывать исключения в инициализаторе без каких-то причин.
        // Обязательно должен быть альтернативный путь работы инициализатора, не приводящий к исключению.
        if (true) {
            throw new ExceptionInInitializerError("Исключение!");
        }
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
