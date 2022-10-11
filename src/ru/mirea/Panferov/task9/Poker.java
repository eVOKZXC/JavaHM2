package ru.mirea.Panferov.task9;

import java.util.Scanner;

public class Poker  {
    static public void main(String[] args){
        Card[] cards = new Card[36];
        Scanner scanner = new Scanner(System.in);
        int n;
        while(true){
            System.out.println("Введите количество игроков: ");
            n = scanner.nextInt();
            if (n <= 7)
                break;
        }
    }

    static public Card createCard(Card[] cards){
        int masterOrd = (int)(Math.random()*4);
        int DignityOrd = (int)(Math.random()*9);
    }
}
