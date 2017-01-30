package com.javarush.test;

import java.awt.*;

/* Bingo-2
level 14.lesson02.task02;
Исправь строчку 'Cat o = new Cat();' так, чтобы программа вывела "Bingo!"
*/

public class Solution
{
  public static void main(String[] args)
  {
    Cat o = new Cat();

    boolean isCat = o instanceof Cat;
    boolean isMoveable = o instanceof Moveable;
    boolean isTom = o instanceof TomCat;

    if (isCat && isMoveable && isTom) System.out.println("Bingo!");

  }

  interface Moveable
  {
  }

  static class Cat
  {
  }

  static class TomCat extends Cat implements Moveable
  {

  }
}
