package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface  {
        private String fullFileName;
        private String fileContent="";
        String str = "";

        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        public String getFileContent() {
            return str;
        }
        public void run() {
            try {
                BufferedReader fileReader = new BufferedReader(new FileReader(this.fullFileName));
                while (fileReader.ready()) {
                    str = str + fileReader.readLine() + " ";
                }
                fileReader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
