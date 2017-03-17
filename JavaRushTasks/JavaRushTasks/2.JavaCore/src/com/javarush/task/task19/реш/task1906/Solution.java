package com.javarush.task.task19.task1906;

/* 
Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.

Пример:
второй байт, четвертый байт, шестой байт и т.д.

Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        FileReader fileReader = new FileReader(a);
        FileWriter fileWriter = new FileWriter(b);
        while (fileReader.ready()){
            int c = fileReader.read();
            int d = fileReader.read();
            fileWriter.write(d);
    }

        fileWriter.close();
        fileReader.close();
        bufferedReader.close();
    }
}
