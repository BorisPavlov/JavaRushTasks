package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        //вводим имя файла
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            FileInputStream fileInputStream = new FileInputStream(reader.readLine());
            Scanner scanner = new Scanner(fileInputStream);
            //строка для парсинга (далее будет ясно зачем)
            reader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }

            fileInputStream.close();
            reader.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}