package com.javarush.task.task23.task2312;

/**
 * Created by DDS_TS_2 on 12.09.2017.
 */
public class Room {
    private int width;
    private int height;
    private Mouse mouse;

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    private Snake snake;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public static void main(String[] args) {

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
