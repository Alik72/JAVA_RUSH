package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
С консоли считать имя файла.
Посчитать в файле количество символов ‘,‘, количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ‘,‘.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        byte[] array = new byte[fileInputStream.available()];
        fileInputStream.read(array);
        String text = new String(array);

        int count = 0;
       char a = ',';

//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == a){ count++; } }

        for(char ch : text.toCharArray()) {
            if(a==ch) {  count++;    }
}
        System.out.println(count);
        fileInputStream.close();
        reader.close();
    }}
