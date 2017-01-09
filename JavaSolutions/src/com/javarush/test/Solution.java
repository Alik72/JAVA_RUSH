package com.javarush.test;

import java.awt.*;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Компиляция программы
level 13.lesson11.home10;
1. Исправь классы Fox и BigFox так, чтобы программа компилировалась. Задача не предполагает создания экземпляров базового класса.
2. Метод main менять нельзя.
*/

public class Solution
{

  public static void main(String[] args) throws Exception
  {
    Fox bigFox = new BigFox();
    System.out.println(bigFox.getName());
    System.out.println(bigFox.getColor());
  }

  public interface Animal
  {
    Color getColor();
  }

  public static class Fox implements Animal
  {
    public String getName() {
      return "Fox";
    }
  }

  public abstract static class BigFox
  {

  }

}
