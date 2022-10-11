package ru.mirea.Panferov.task9;

import java.util.Scanner;

public class Poker  {
    static public void main(String[] args){
        Card[] cards = new Card[36];
        Scanner scanner = new Scanner(System.in);
        int n;
        while(true){
            System.out.print("Введите количество игроков: ");
            n = scanner.nextInt();
            if (n <= 7)
                break;
        }

        for (int i = 0; i < n*5; i++){
            cards[i] = createCard(cards);
        }

        int index = 0;
        for (int i = 1; i <= n; i++){
            System.out.print("==========================\n");
            System.out.printf("Карты %d игрока: \n", i);
            for(int j = 0; j < 5; j++){
                System.out.println(cards[index]);
                index++;
            }
        }
    }

    static public Card createCard(Card[] cards){
        int masterOrd = (int)(Math.random()*4);
        int dignityOrd = (int)(Math.random()*9);
        Card cardFunc = new Card();

        switch (masterOrd) {
            case 0 -> cardFunc.setMaster(Masters.Club);
            case 1 -> cardFunc.setMaster(Masters.Diamond);
            case 2 -> cardFunc.setMaster(Masters.Heart);
            case 3 -> cardFunc.setMaster(Masters.Spades);
        }
        switch (dignityOrd) {
            case 0 -> cardFunc.setDignity(Dignities.Six);
            case 1 -> cardFunc.setDignity(Dignities.Seven);
            case 2 -> cardFunc.setDignity(Dignities.Eight);
            case 3 -> cardFunc.setDignity(Dignities.Nine);
            case 4 -> cardFunc.setDignity(Dignities.Ten);
            case 5 -> cardFunc.setDignity(Dignities.Jack);
            case 6 -> cardFunc.setDignity(Dignities.Queen);
            case 7 -> cardFunc.setDignity(Dignities.King);
            case 8 -> cardFunc.setDignity(Dignities.Ace);
        }

        for (Card card : cards) if (cardFunc.equals(card)){
            cardFunc = createCard(cards);
        }
        return cardFunc;
    }
}
