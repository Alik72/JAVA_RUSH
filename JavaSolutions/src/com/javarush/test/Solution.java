package com.javarush.test;

import java.awt.*;

/* Bingo
level 14.lesson02.task01;
Исправь строчку 'Object o = new Pet();' в методе main так, чтобы программа вывела "Bingo!"
*/

public class Solution
{
  public static void main(String[] args)
  {
    Object o = new Pet();
    boolean isCat = o instanceof Cat;
    boolean isTiger = o instanceof Tiger;
    boolean isPet = o instanceof Pet;

    printResults(isCat, isTiger, isPet);
  }

  private static void printResults(boolean cat, boolean tiger, boolean pet)
  {
    if (cat && tiger && pet) System.out.println("Bingo!");
  }

  static class Pet
  {
  }

  static class Cat extends Pet
  {
  }

  static class Tiger extends Cat
  {
  }

}
