package com.javarush.test;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Пиво и кола
level 13.lesson02.task03;
Реализуй интерфейс Drink в классах Beer и Cola.
*/

public class Solution
{
  public static void main(String[] args) throws Exception
  {

    print(new Beer());
    print(new Cola());

  }

  private static void print(Drink drink)
  {
    System.out.println(drink.getClass().getSimpleName());
  }

  public interface Drink
  {
    boolean isAlcoholic();
  }

  public static class Beer
  {
  }

  public static class Cola
  {
  }
}
