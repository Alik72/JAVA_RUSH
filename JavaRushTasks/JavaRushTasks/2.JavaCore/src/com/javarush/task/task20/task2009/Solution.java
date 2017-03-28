package com.javarush.task.task20.task2009;

/* 
Как сериализовать static?
Сделай так, чтобы сериализация класса ClassWithStatic была возможной.
*/
public class Solution {
    public static class ClassWithStatic {
        public static String staticString = "it's test static string";
        public int i;
        public int j;
    }

    public static void main(String[] args) {

    }
}
