package com.javarush.test;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Все скрыто
level11.lesson08.task01;
Скрыть все внутренние переменные класса Cat.
*/

public class Solution
{
  public static void main(String[] args)
  {
  }

  public class Cat
  {
    public String name;
    public int age;
    public int weight;

    public Cat()
    {
    }

    public Cat(String name, int age, int weight)
    {
      this.name = name;
      this.age = age;
      this.weight = weight;
    }
  }
}
