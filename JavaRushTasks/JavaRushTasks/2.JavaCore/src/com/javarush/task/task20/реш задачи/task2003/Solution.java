package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполни карту properties данными из файла.
Про .properties почитать тут — http://ru.wikipedia.org/wiki/.properties
Реализуй логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = bufferedReader.readLine();
        bufferedReader.close();
        InputStream inputStream = new FileInputStream(nameFile);
        load(inputStream);
        inputStream.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties pr = new Properties();
        for (Map.Entry<String, String> l : properties.entrySet()){
            pr.put(l.getKey(),l.getValue());
        }
        pr.store(outputStream,"");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties pr = new Properties();
        pr.load(inputStream);
        for (Map.Entry<Object, Object> l : pr.entrySet()){
            properties.put(l.getKey().toString(), l.getValue().toString());
        }
    }

    public static void main(String[] args) throws Exception {

    }
}
