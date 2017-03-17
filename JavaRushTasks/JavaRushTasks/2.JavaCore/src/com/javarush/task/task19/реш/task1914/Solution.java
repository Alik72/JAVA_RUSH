package com.javarush.task.task19.task1914;

/* 
Решаем пример
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйтесь testString.
Верни переменной System.out первоначальный поток.

Возможные операции: + — *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов — нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String resultat = outputStream.toString();
        System.setOut(consoleStream);
        String[] s = resultat.split(" ");
        final int a = Integer.parseInt(s[0]);
        final int b = Integer.parseInt(s[2]);
        int c = 0;
        if (s[1].equals("+")){c = a + b; }
        else if (s[1].equals("-")){c = a - b; }
        else if (s[1].equals("*")){c = a * b; }
        System.out.println(s[0] + " " + s[1] + " " +s[2] + " " +s[3] + " " + c);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

