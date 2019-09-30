package com.company.homework_6.task_1;

public class Task_1 {
    public static void main(String[] args) {
        try {
            int a = 3;
            int b = a / 0;
        } catch (ArithmeticException e) {
            // e.getMessage(), иначе ты выдаешь полный стек трейс
            System.out.println("исключение: " + e);
        }
        
        // вот эта строка отработает даже, если пользователь введет корректные данные, а не должна, ее в блок catch
        System.out.println("на 0 делить нельзя");
    }
}
