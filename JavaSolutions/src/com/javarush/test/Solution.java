package com.javarush.test;

import java.awt.*;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Класс BigFox
level 13.lesson04.task04;
1. Исправь класс BigFox так, чтобы программа компилировалась.
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

  public static abstract class Fox implements Animal
  {
    public String getName() {
      return "Fox";
    }
  }

  //add your code below
  public static class BigFox
  {
    public Color () {
      return Color.GRAY;
    }
  }

}

