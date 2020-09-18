package com.javarush.task.task13.task1326;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws IOException {
        //вводим имя файла
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String fullFileName = "c:\\" + fileName + ".txt";
        //формируем поток
        FileInputStream fileInputStream = new FileInputStream(fullFileName);
        // формируем ArrayList для хранения отсортированных чисел
        ArrayList<Integer> list = new ArrayList<Integer>();
        //строка для парсинга (далее будет ясно зачем)
        reader = new BufferedReader(new InputStreamReader(fileInputStream));
        while (reader.ready()) {
            int n = Integer.parseInt(reader.readLine());
            if (n%2 == 0) list.add(n);
        }

        fileInputStream.close();
        reader.close();

        list.sort(Comparator.naturalOrder());   // отсортировали по возрастанию
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) System.out.println(list.get(i));
        }
    }
}
