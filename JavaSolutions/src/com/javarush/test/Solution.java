package com.javarush.test;

/**
 * Created by Homosapiens on 19.10.2016.
 */
/* Пиво
level13.lesson02.task01;
1. Подумай, какой из двух интерфейсов нужно реализовать в классе Beer.
2. Добавь к классу Beer этот интерфейс и реализуйте все нереализованные методы.
3. Подумай, как связаны переменная  READY_TO_GO_HOME и метод isReadyToGoHome.
4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.
*/

public class Solution
{
  public static void main(String[] args) throws Exception
  {
  }

  public interface Drink
  {
    void askMore(String message);

    void sayThankYou();

    boolean isReadyToGoHome();
  }

  public interface Alcohol extends Drink
  {
    boolean READY_TO_GO_HOME = false;

    void sleepOnTheFloor();
  }

  public static class Beer
  {

  }
}
