package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(read.readLine());
        int min = Integer.MAX_VALUE;
        while (fileInputStream.available()>0){
            int a = fileInputStream.read();
            if (a < min){ min = a; }}
            System.out.println(min);
            fileInputStream.close();
            read.close();
        }

    }
