package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DDS_TS_2 on 23.05.2017.
 */
public class Hippodrome {


    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static Hippodrome game;

    public void run () throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move (){
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }
    public void print (){
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public static void main(String[] args) throws InterruptedException {

      game = new Hippodrome(new ArrayList<>()) ;

        Horse o = new Horse("one",3, 0);
        Horse d = new Horse("two",3, 0);
        Horse t = new Horse("three",3, 0);
        game.getHorses().add(o);
        game.getHorses().add(d);
        game.getHorses().add(t);
        game.run();

    }
}
