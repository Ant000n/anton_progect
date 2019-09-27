package com.company.homework_6.task_3;

// форматируй код
// используй класс Scanner для этой задачи и внимательнее прочитай условие
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
