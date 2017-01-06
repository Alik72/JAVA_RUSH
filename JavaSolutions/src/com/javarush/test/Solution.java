package com.javarush.test;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* CleverMan и SmartGirl
level13.lesson02.task10;
1. Добавь интерфейсы Secretary и Boss к классам CleverMan и SmartGirl. По одному на каждый. Подумай, кому какой.
2. Унаследуй  интерфейсы Secretary и Boss от интерфейсов Person и Workable так,
чтобы все методы у классов CleverMan и SmartGirl оказались объявленными в каком-то интерфейсе.
*/

public class Solution
{
  public static void main(String[] args) throws Exception
  {
  }

  interface Person
  {
    void use(Person person);
    void startToWork();
  }

  interface Workable
  {
    boolean wantGetExtraWork();
  }

  interface Secretary
  {
  }

  interface Boss
  {
  }

  class CleverMan
  {
    public void use(Person person)
    {
      person.startToWork();
    }

    public void startToWork()
    {
    }

    public boolean wantGetExtraWork()
    {
      return true;
    }
  }

  class SmartGirl
  {
    public void use(Person person)
    {
    }

    public void startToWork()
    {
    }
  }
}
