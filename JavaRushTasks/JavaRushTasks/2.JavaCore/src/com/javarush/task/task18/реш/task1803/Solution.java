package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

/* 
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        Integer bayteMax = 0;
        Integer countMax = 0;
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

        for (Entry<Integer, Integer> me : hm.entrySet()) {
           Integer bayte = me.getKey();
           Integer count = me.getValue();
           if (count > countMax){
               countMax = count;
               bayteMax = bayte;
           }
           }
        for (Entry<Integer, Integer> me : hm.entrySet()) {
            Integer bayte = me.getKey();
            Integer count = me.getValue();
            if (count == countMax){
                System.out.print(bayte + " ");
            }
        }

        fileInputStream.close();
        reader.close();
    }



    }

