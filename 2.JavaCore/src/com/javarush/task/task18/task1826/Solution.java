package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String parameter = args[0];
        String fileName = args[1];
        String fileOutputName = args[2];

        if (parameter.equals("-e")) {
            try (FileInputStream fileInputStream = new FileInputStream(fileName);
                 FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName)) {
                 while (fileInputStream.available() > 0) {
                     fileOutputStream.write(fileInputStream.read() + 32);
                }
            }
        }
        else if (parameter.equals("-d")) {
            try (FileInputStream fileInputStream = new FileInputStream(fileName);
                 FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName)) {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() - 32);
                }
            }

        }
    }
}
