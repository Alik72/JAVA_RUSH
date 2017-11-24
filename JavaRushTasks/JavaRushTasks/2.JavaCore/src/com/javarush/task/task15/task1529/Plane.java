package com.javarush.task.task15.task1529;

/**
 * Created by DDS_TS_2 on 24.11.2017.
 */
public class Plane implements Flyable {

    private int passenger;
    @Override
    public void fly() {

    }

    public Plane(int passenger) {
        this.passenger = passenger;
    }
}