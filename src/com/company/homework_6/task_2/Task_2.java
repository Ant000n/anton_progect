package com.company.homework_6.task_2;

public class Task_2 {
    public static void main(String[] args) {
        String text = "123d";
        try {
            int retrievedNumber = Integer.parseInt(text);
            System.out.println(retrievedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Исключение" + e);
        }
        // тот же комментарий, что к Таск_1. Эта строка должна отрабатывать только если некорректное число, в блок catch ее
        System.out.println("Неверный формат строки");
    }
}
