package com.javarush.test;

/**
 * Created by Homosapiens on 21.10.2016.
 */

public class Cat {

 public static String name;
  public Cat(String s) {
    name = s;
  }
  public static void main(String[] args) {
    Cat cat = new Cat("Vaska");
    String text = "My cat is " + cat;
    System.out.println(text);




  }}