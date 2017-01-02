package com.javarush.test;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Или «Кошка», или «Собака», или «Птица», или «Лампа»
level12.lesson02.task04;
Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/

public class Solution
{
  public static void main(String[] args)
  {
    printObjectType(new Cat());
    printObjectType(new Bird());
    printObjectType(new Lamp());
    printObjectType(new Cat());
    printObjectType(new Dog());
  }

  public static void printObjectType(Object o)
  {
    //Напишите тут ваше решение
  }

  public static class Cat
  {
  }

  public static class Dog
  {
  }

  public static class Bird
  {
  }

  public static class Lamp
  {
  }
}
