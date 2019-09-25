package com.company.homework_6.task_1;

public class Task_1 {
    public static void main(String[] args) {
        try {
            int a = 3;
            int b = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("исключение: " + e);
        }
        System.out.println("на 0 делить нельзя");
    }
}