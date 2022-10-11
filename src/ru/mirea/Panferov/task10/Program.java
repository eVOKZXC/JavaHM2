package ru.mirea.Panferov.task10;

import java.util.Scanner;

public class Program {
    static public void main(String[] args){
        String userStr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        userStr = scanner.nextLine();
        String[] words = userStr.split(" ");
        System.out.printf("Количество слов в вашем предложении: %d", words.length);
    }
}
