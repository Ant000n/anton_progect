package com.company.homework_5.task_2;

public class Task_2 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        int min, max;

        // в цикле Math.random() лучше использовать
        ints[0] = 94;
        ints[1] = 9;
        ints[2] = 21;
        ints[3] = 77;
        ints[4] = 61;
        ints[5] = 99;
        ints[6] = 1;
        ints[7] = 32;
        ints[8] = 49;
        ints[9] = 25;

        min = max = ints[0]; // <- если будет пустой массив, то получишь исключение. Подумай как этого избежать
        // 10 -> ints.length
        for (int i = 1; i < 10; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
            if (ints[i] > max) {
                max = ints[i];
            }
        }
        System.out.println("min = " + min + ", max = " + max);
    }
}
