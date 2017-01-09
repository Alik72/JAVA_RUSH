package com.javarush.test;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Интерфейс Updatable в классе Screen
level13.lesson11.home08;
Реализовать интерфейс Updatable в классе Screen.
*/

public class Solution
{
  public static void main(String[] args) throws Exception
  {
  }

  interface Selectable
  {
    void onSelect();
  }

  interface Updatable extends Selectable
  {
    void refresh();
  }

  class Screen
  {

  }
}

