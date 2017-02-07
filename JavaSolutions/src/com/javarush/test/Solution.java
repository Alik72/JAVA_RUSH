package com.javarush.test;
/* Нашествие эксепшенов
level 14.lesson08.bonus01;
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
  public static List<Exception> exceptions = new ArrayList<Exception>();

  public static void main(String[] args)
  {
    initExceptions();

    for (Exception exception : exceptions)
    {
      System.out.println(exception);
    }
  }

  private static void initExceptions()
  {   //it's first exception
    try
    {
      float i = 1 / 0;

    } catch (Exception e)
    {
      exceptions.add(e);
    }

    //Add your code here

  }
}
