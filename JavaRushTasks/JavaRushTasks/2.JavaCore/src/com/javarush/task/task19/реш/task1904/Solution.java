package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
В классе адаптере создать приватное финальное поле Scanner fileScanner. Поле инициализировать в конструкторе с
одним аргументом типа Scanner.

Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950
Петров Петр Петрович 31 12 1957

В файле хранится большое количество людей, данные одного человека находятся в одной строке.
Метод read() должен читать данные только одного человека.
*/

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
     Scanner fileScanner = new Scanner(new File("c:/p.txt"));
     PersonScanner personScanner = new PersonScannerAdapter(fileScanner);
    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {

            this.fileScanner = fileScanner;
        }
        @Override
        public Person read() throws IOException {
            String[] list = fileScanner.nextLine().split(" ");
            Calendar cal = Calendar.getInstance();
            cal.set(Integer.parseInt(list[5]),Integer.parseInt(list[4]),Integer.parseInt(list[3]));
            Date date = cal.getTime();
            return new Person(list[0],list[1],list[2],date);
        }

        @Override
        public void close() throws IOException {
           fileScanner.close();
        }

    }
}
