package ru.skypro.homework;

public class test {
    public static void main(String[] args) {
        int [] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000) + 100000;

            System.out.println(arr[i]);
        }
    }
}
