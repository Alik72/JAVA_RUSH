package com.javarush.test;

import java.awt.*;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Один метод в классе
level13.lesson11.home09;
1. Унаследовать Fox от интерфейса Animal.
2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
3. Методы удалять нельзя!
*/

public class Solution
{
  public static void main(String[] args) throws Exception
  {
  }

  public interface Animal
  {
    Color getColor();

    Integer getAge();
  }

  public static class Fox
  {
    public String getName()
    {
      return "Fox";
    }
  }
}


