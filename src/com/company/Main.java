package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String myFavoriteNumber;
        final int NUM = -777;
        String word = "Мое любимое число: ";
        myFavoriteNumber = NUM + " " + word;
        System.out.println(myFavoriteNumber);


        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили  положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        System.out.println("Введите ваше имя: ");
        Scanner username = new Scanner(System.in);
        System.out.println("Здравствуйте" + username.nextLine() + "!");
    }
}
