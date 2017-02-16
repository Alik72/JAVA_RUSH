package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {

        labels.put(1.0,"hfvhgvhg");
        labels.put(1.1,"hfvhgvh");
        labels.put(1.2,"hfvhgv");
        labels.put(1.3,"hfvhg");
        labels.put(1.4,"hfvh");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
