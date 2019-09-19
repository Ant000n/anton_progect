package com.company.homework_5.task_1;



public class Task_1 {
    public static void main(String[] args) {
        int[] ints = new int[100];

        System.out.println("Выводим сумму четных чисел: ");
        for (int i = 0; i <ints.length; i++) {
            if (ints[i]%2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Выводим сумму нечетных чисел: ");
        for (int i = 0; i <ints.length; i++) {
            if (ints[i]%2 != 0) {
                System.out.println(i);
            }
        }
    }
}
