package com.javarush.task.task23.task2312;

import java.util.*;

/**
 * Created by DDS_TS_2 on 12.09.2017.
 */
public class Snake {

    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
        sections = new ArrayList<SnakeSection>();
        sections.add(new SnakeSection(x, y));
        isAlive = true;

    }
    public void move() {
        if (isAlive) {
            if (direction == SnakeDirection.UP) {
                move(0, -1);
            }
            else if (direction == SnakeDirection.RIGHT) {
                move(1, 0);
            }
            else if (direction == SnakeDirection.DOWN) {
                move(0, 1);
            }
            else if (direction == SnakeDirection.LEFT) {
                move(-1, 0);
            }
        }
    }
    public void move(int x, int y) {

    }
    public int getX(){
        return sections.get(0).getX();
    }
    public int getY(){
        return sections.get(0).getY();
    }


    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public void checkBorders(SnakeSection head){
        int headX = head.getX();
        int headY = head.getY();
        int widthRoom = Room.game.getWidth();
        int heightRoom = Room.game.getHeight();

        if (headX<0 || headX>=widthRoom || headY<0 || headY>=heightRoom){
            isAlive = false;
        }
        System.out.println(isAlive);
    }
    public void checkBody(SnakeSection head){

      if (sections.contains(head)){
          isAlive = false;
      }
    }
}
