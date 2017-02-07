package com.javarush.test;

/* Статики 1
level 15.lesson09.task01;
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
  public static Map<Double, String> labels = new HashMap<Double, String>();

  public static void main(String[] args) {
    System.out.println(labels);
  }
}
