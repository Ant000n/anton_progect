package com.company.homework_5.task_4;

public class Task_4 {
    public static void main(String[] args) {
// 6 лучше вынести в отдельную переменную
        for (int i = 6; i >= 0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
