package ru.skypro.homework;

public class Homework3 {
    public static void main(String[] args) {
        // первое задание по циклам
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println();
        int a = 11;
        while (a > 1) {
            a--;
            System.out.print(a);
        }

        // второе задание

        //int monthNumber = 2;
        System.out.println();
        for (int monthNumber = 2; monthNumber <= 31 ; monthNumber = monthNumber + 7) {
            System.out.println("Сегодня пятница " + monthNumber + "-е число. Необходимо приготовить отчет");
        }
        // третье задание
        int date;
        int i;
        for (i = 0, date = 2021; i >= date - 200 && i <= date + 100; i = i+79) {
            System.out.println("Столкновение было в" + i + " году");
        }

    }

}
