package com.javarush.task.task19.task1908;

/* 
Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader reader = new BufferedReader(new FileReader(a));
        BufferedWriter writer = new BufferedWriter(new FileWriter(b));

        while (reader.ready()){
            String s = reader.readLine();
            String[] d = s.split(" ");

            for (int i = 0; i < d.length; i++) {
                try {
                    String v = String.valueOf(Integer.parseInt(d[i]));
                    writer.write(v + " ");
                }
                catch (Exception e){
                }
            }
        }
         writer.close();
        reader.close();
    }

}
