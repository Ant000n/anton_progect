package com.company.homework_5.task_1;


public class Task_1 {
    public static void main(String[] args) {
        // evenSum
        int sum = 0;
        for (int i = 0; i <= 100; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Сумма четных чисел: " + sum);
        // sum_1 -> oddSum
        int sum_1 = 0;
        for (int x = 0; x <= 100; x++) {
            if (x % 2 != 0) {
                sum_1 = sum_1 + x;
            }
        }
        System.out.println("Сумма нечетных чисел: " + sum_1);
// пустая строка не нужна
    }
}
