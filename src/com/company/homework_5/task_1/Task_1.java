package com.company.homework_5.task_1;


public class Task_1 {
    public static void main(String[] args) {
        // evenSum
        int evenSum = 0;
        for (int i = 0; i <= 100; i = i + 2) {
            evenSum = evenSum + i;
        }
        System.out.println("Сумма четных чисел: " + evenSum);
        // sum_1 -> oddSum
        int oddSum = 0;
        for (int x = 0; x <= 100; x++) {
            if (x % 2 != 0) {
                oddSum = oddSum + x;
            }
        }
        System.out.println("Сумма нечетных чисел: " + oddSum);
    }
}
