package com.javarush.test;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Параметризованый интерфейс
level 13.lesson02.task07;
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
*/

public class Solution
{
  public static void main(String[] args) throws Exception
  {
  }

  interface SimpleObject<T>
  {
    SimpleObject<T> getInstance();
  }

  class StringObject //допишите здесь ваш код
  {
  }
}
