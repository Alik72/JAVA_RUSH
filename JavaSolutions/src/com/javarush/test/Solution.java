package com.javarush.test;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Интерфейс SimpleObject
level13.lesson11.home07;
1. Создай класс StringObject.
2. В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
3. Программа должна компилироваться.
*/

public class Solution
{
  public static void main(String[] args) throws Exception
  {
    SimpleObject<String> stringObject = new StringObject<Object>();
  }

  interface SimpleObject<T>
  {
    SimpleObject<T> getInstance();
  }

}
