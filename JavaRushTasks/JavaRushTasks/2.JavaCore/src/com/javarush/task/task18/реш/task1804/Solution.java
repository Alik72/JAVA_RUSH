package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        Integer bayteMin = Integer.MAX_VALUE;
        Integer countMin = Integer.MAX_VALUE;

        ArrayList<Integer> list = new ArrayList<>();

        while (fileInputStream.available() > 0){
            int a = fileInputStream.read();
            list.add(a);
        }

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        Integer am;
        for (Integer i : list) {
            am = hm.get(i);
            hm.put(i, am == null ? 1 : am + 1);
        }

        for (Map.Entry<Integer, Integer> me : hm.entrySet()) {
            Integer bayte = me.getKey();
            Integer count = me.getValue();
            if (count < countMin){
                countMin = count;
                bayteMin = bayte;
            }

        }
        for (Map.Entry<Integer, Integer> me : hm.entrySet()) {
            Integer bayte = me.getKey();
            Integer count = me.getValue();
            if (count == countMin){
                System.out.print(bayte + " ");
            }
        }

        fileInputStream.close();
        reader.close();
    }
}
