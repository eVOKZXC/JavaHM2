package ru.mirea.Panferov.task3;
import java.lang.Math;

public class Program {
    static public void main(String[] args){
        int counter = 5;
        Circle[] circles = new Circle[counter];
        for (int index = 0; index < counter; index++){
            Point center = new Point((int)(Math.random()*11), (int)(Math.random()*11));
            circles[index] = new Circle(center, (int)(Math.random()*101));
            System.out.println(circles[index]);
        }
    }
}
