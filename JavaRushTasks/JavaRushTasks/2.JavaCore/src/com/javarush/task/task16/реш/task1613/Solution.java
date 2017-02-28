package com.javarush.task.task16.task1613;

/* 
Big Ben clock
1. Разберись, что делает программа.
2. Реализуй логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе

Пример:
В г. Лондон сейчас 23:59:58!
В г. Лондон сейчас 23:59:59!
В г. Лондон сейчас полночь!
В г. Лондон сейчас 0:0:1!
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
                int izmena = 1;
                seconds = seconds;
                Thread.sleep(1000);

            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("В г. %s сейчас полночь!", cityName));
            } else {
                System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
            }
            if (seconds < 59) seconds ++;
            if (seconds == 59){
                izmena++;
            }
            if (izmena == 2 & hours == 23 & minutes == 59 & seconds == 59){
                hours = 0; minutes = 0 ; seconds = 0;izmena = 0; }
             if (izmena == 2 & hours < 23 & minutes < 59 & seconds == 59){ minutes++; seconds = 0;izmena =1;}
            else if (izmena == 2 & hours < 23 & minutes == 59 & seconds == 59){ hours++; seconds = 0;minutes = 0;izmena =1;}


    }
}}
