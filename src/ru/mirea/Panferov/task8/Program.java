package ru.mirea.Panferov.task8;

public class Program {
    static public void main(String[] args){
        String[] massive = new String[]{"Бебра", "Череп", "Учеба", "Java", "Дом"};

        for(int i = 0; i < massive.length; i++){
            massive[i] = new StringBuilder(massive[i]).reverse().toString();
            System.out.print(massive[i] + " ");
        }
    }
}
