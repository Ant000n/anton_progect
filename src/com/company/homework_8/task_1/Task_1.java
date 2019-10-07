package com.company.homework_8.task_1;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] ints = {8, 2, 6, 1, 7};

        boolean isSortes = false;
        int buf;
        while (!isSortes) {
            isSortes = true;
            for (int i = 0; i < ints.length - 1; i++) {
                if (ints[i] > ints[i + 1]) {
                    isSortes = false;
                    buf = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}