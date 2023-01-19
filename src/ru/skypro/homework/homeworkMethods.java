package ru.skypro.homework;

//первое задание

import java.util.Arrays;

public class homeworkMethods {
    public static void printYear() {
        int year = 2021;
        int i = year % 4;
        if (i == 0) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год не високосный");
        }
    }
    public static void telephoneOS () {
        int oS = 0;
        int clientDeviceYear = 2015;
        int newYear = 2023;
        if (oS == 0 && clientDeviceYear < newYear) {
            System.out.println("Установить облегченную версию для IOS по ссылке: ...");
        }
        if (oS == 0 && clientDeviceYear == newYear) {
            System.out.println("Установить текущую версию для IOS по ссылке: ...");
        }
        if (oS == 1 && clientDeviceYear < newYear) {
            System.out.println("Установить облегченную версию для Android по ссылке: ...");
        }
        if (oS == 1 && clientDeviceYear == newYear) {
            System.out.println("Установить текущую версию для Android по ссылке: ...");
        }
    }

    public static void deliveryDay() {
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки - 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Срок доставки - 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Срок доставки - 3 дня");
        } else
            System.out.println("На расстояние больше 100км доставку не осуществляем");
    }

    public static void searchDoubleSymbol() {
        String name = "abcd";
        char[] nameArray = name.toCharArray();
        for (int i = 0; i < nameArray.length - 1; i++) {
            //for (int a = i + 1; a < nameArray.length; a++) {
            if (nameArray[i] == nameArray[i + 1]) {
                System.out.println("Найден дубль " + nameArray[i + 1]);
                break;
            } else if (i + 1 >= nameArray.length - 1)
                System.out.println("Дублей не найдено");
            }
        }

    public static void main(String[] args) {
        printYear(); // первое задание
        telephoneOS(); // второе задание
        deliveryDay(); // третье задание
        searchDoubleSymbol(); //четвертое задание
    }


}


