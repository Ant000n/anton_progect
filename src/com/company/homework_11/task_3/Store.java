package com.company.homework_11.task_3;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<String> toys;

    public Store(int maxcount) {
        toys = new ArrayList<>(maxcount);
    }
    public boolean add(String toy) {
        synchronized (this) {
            return toys.add(toy);
        }
    }

    public List<String> getToys() {
        return toys;
    }
}
