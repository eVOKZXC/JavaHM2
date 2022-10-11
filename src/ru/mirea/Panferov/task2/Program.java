package ru.mirea.Panferov.task2;

public class Program {
    static public void main(String[] args){
        Ball ball = new Ball(3, 12);
        System.out.println(ball);
        ball.move(2.3, -5);
        System.out.println(ball);
    }
}
