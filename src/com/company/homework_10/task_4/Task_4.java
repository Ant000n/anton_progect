package com.company.homework_10.task_4;

import java.util.ArrayList;
import java.util.List;

//+
public class Task_4 {
    public static void main(String[] args) {
        List<Integer> arrayListOne = new ArrayList<>();
        List<Integer> arrayListTwo = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            arrayListOne.add(i);
        }
        for (int i = 0; i <= 7; i++) {
            arrayListTwo.add(i);
        }
        arrayListOne.retainAll(arrayListTwo);
        System.out.println(arrayListOne);
    }
}
