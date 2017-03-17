package com.javarush.task.task19.task1909;

/* 
Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла и заменить все точки «.» на знак «!«.
Результат вывести во второй файл.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        reader.close();
        BufferedReader filereader = new BufferedReader(new FileReader(a));
        BufferedWriter filewriter = new BufferedWriter(new FileWriter(b));

        while (filereader.ready()){
           int data = filereader.read();
           if (!((char)data == '.')){
               filewriter.write(data);
           }
           else filewriter.write("!");
        }
        filereader.close();
        filewriter.close();
    }
}
