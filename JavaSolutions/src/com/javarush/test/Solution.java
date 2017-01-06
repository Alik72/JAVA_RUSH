package com.javarush.test;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Исправление кода
level13.lesson04.task02;
Исправить код так, чтобы программа выполнялась и выводила "Я переводчик с английского".
Метод main менять нельзя!
*/

public class Solution
{
  public static void main(String[] args) throws Exception
  {
    Translator translator = new Translator();
    System.out.println(translator.translate());
  }

  public abstract static class Translator
  {
    public String translate()
    {
      return "Я переводчик с английского";
    }
  }


}
