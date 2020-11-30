package com.javarush.task.task13.task1319;
import java.io.*;
/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String outputFileName = reader.readLine();
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                    writter.write(line + "\n");
                }
                writter.write(line + "\n");
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
