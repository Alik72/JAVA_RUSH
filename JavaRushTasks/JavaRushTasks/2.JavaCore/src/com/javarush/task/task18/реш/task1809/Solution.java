package com.javarush.task.task18.task1809;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String in = reader.readLine();
        String out = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(in);
        byte[] massiv = new byte[inputStream.available()];
        inputStream.read(massiv);
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(out);
        for (int i = massiv.length-1; i >= 0  ; i--) {
            outputStream.write(massiv[i]);
        }
        outputStream.close();


    }
}
