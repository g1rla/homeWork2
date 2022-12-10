package ru.skypro.homework;
import java.util.Arrays;

public class Array {

// первое задание
    public static void main(String[] args) {
        int [] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000) + 100000;
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц " + sum + " рублей");

        // второе задание, ищем максимальную и минимальную трату

        int maxArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        System.out.println("Максимальная трата " + maxArr);

        int minArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minArr)
                minArr = arr[i];
        }
        System.out.println("Минимальная трата " + minArr);

        // третье задание, найти среднее значение, т.к. в первом задании мы находили уже
        // сумму всех элементов, то я воспользовалаой переменной из первого задания
        float middle;
        for (int i = 0; i < arr.length; i++) {
        }
        middle = sum/30;
        System.out.println("Средняя трата за месяц " + middle);

        // четвертое задание
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);
        }


    }


}

