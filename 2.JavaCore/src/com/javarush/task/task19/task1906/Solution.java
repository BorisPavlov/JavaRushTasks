package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = fileReader.readLine();
        String fileName2 = fileReader.readLine();
        fileReader.close();

        FileReader reader = new FileReader(fileName1);
        FileWriter writer = new FileWriter(fileName2);

        int count = 0;
        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = reader.read(); //читаем один символ (char будет расширен до int)
            count++;
            if (count % 2 == 0 ) writer.write(data);
        }

        //закрываем потоки после использования
        reader.close();
        writer.close();
    }
}
