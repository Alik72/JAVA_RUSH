package com.javarush.test;

import java.awt.*;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Интерфейс Animal
level13.lesson04.task03;
1. Унаследовать Fox от интерфейса Animal.
2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
3. Создавать дополнительные классы и удалять методы нельзя!
*/

public class Solution
{
  public static void main(String[] args) throws Exception
  {
  }

  public interface Animal
  {
    Color getColor();
  }

  public static class Fox
  {
    public String getName()
    {
      return "Fox";
    }
  }
}
