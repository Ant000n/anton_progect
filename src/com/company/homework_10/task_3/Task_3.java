package com.company.homework_10.task_3;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

// +
public class Task_3 {
    public static void main(String[] args) {
        List<Integer> arrayListOne = new ArrayList<>();
        List<Integer> arrayListTwo = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            arrayListOne.add(i);
        }
        for (int i = 0; i <= 5; i++) {
            arrayListTwo.add(i);
        }
        arrayListOne.removeAll(arrayListTwo);
        System.out.println(arrayListOne);
    }
}
