package ru.skypro.homework;

public class homeWorkString {
    public static void main(String[] args) {
        // первое задание
        String firstName = "Ivanov";
        String middleName = "Ivanovich";
        String lastName = "Ivan";
        String fullName = firstName + " " + lastName + " " + middleName;
        System.out.println(fullName);

        // второе задание
        System.out.println();
        System.out.println(fullName.toUpperCase());

        //третье задание

        System.out.println();
        fullName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника административного отдела " + fullName);

        // четвертое задание

        String secondFullName = "Иванов Семён Семёнович";
        if (secondFullName.contains("ё")) {
            secondFullName = secondFullName.replace("ё", "е");
            System.out.println("Данные ФИО сотрудника административного отдела " + secondFullName);
        } else {
            System.out.println("Данные ФИО сотрудника административного отдела " + secondFullName);

        }




    }
}
