package com.javarush.test;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Neo
level13.lesson11.home05;
1. Реализовать интерфейс DBObject в классе User.
2. Реализовать метод initializeIdAndName так, чтобы программа работала и выводила на экран "User has name Neo, id = 1".
3. Метод toString и метод main менять нельзя.
4. Подумай, что должен возвращать метод initializeIdAndName в классе User.
*/

public class Solution
{
  public static void main(String[] args) throws Exception
  {
    System.out.println(Matrix.NEO);
  }


  static class Matrix
  {
    public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
  }

  interface DBObject
  {
    DBObject initializeIdAndName(long id, String name);
  }

  static class User
  {
    long id;
    String name;

    @Override
    public String toString()
    {
      return String.format("User has name %s, id = %d", name, id);
    }
  }

}
