package com.javarush.task.task19.task1910;

/* 
Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла, удалить все знаки пунктуации,
включая символы новой строки.

Результат вывести во второй файл.

http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F

Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        reader.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(a));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(b));
        StringBuilder d = new StringBuilder();

    while (bufferedReader.ready()){
        String s = bufferedReader.readLine().replaceAll("\\W+","");
        d.append(s);
    }
        bufferedWriter.write(String.valueOf(d));
        bufferedWriter.close();
        bufferedReader.close();
    }
}
