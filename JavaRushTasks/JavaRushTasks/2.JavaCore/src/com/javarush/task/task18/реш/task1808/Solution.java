package com.javarush.task.task18.task1808;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.
*/

import java.io.*;
import java.util.Arrays;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        String f3 = reader.readLine();
        reader.close();
        FileInputStream fileinputStream = new FileInputStream(f1);

        int count = fileinputStream.available();

        byte[] array2 = new byte[count%2 ==0 ? count/2 : count/ 2 + 1];
        byte[] array3 = new byte[count/2];

        fileinputStream.read(array2);
        fileinputStream.read(array3);
        fileinputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream(f2);
        fileOutputStream.write(array2);
        fileOutputStream.close();
        fileOutputStream = new FileOutputStream(f3);
        fileOutputStream.write(array3);
        fileOutputStream.close();

    }


}
