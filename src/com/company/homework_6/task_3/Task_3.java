package com.company.homework_6.task_3;

public class Task_3 extends Exception {
    public static void main(String[] args) {
        try {
            int ints[] = new  int[5];
            System.out.println("Доступ к шестому элементу : " + ints[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: " + e);
        }
        System.out.println("Введено число больше, введите число заново");
    }
}