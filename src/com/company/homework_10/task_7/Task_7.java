package com.company.homework_10.task_7;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Task_7 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(4);
        set.add(9);
        set.add(5);
        set.add(3);
        set.add(1);
        System.out.println(set);

        NavigableSet<Integer> navSet = ((TreeSet<Integer>) set).descendingSet();
        System.out.println(navSet);
    }
}
