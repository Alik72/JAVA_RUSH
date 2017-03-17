package com.javarush.task.task19.task1907;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов «world«, которые встречаются в файле.
Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();
        int count = 0;
        while (reader.ready()){
        String s = reader.readLine();;
        String[] m = s.split("\\W+");

        for (String l : m){
            if (l.equals("world")){
                count++;
            }
            System.out.println(l);
        }
        }
        System.out.println(count);
        reader.close();

}}
