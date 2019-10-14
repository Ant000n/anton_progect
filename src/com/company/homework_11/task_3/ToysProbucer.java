package com.company.homework_11.task_3;

// Producer - опечатка
public class ToysProbucer implements Runnable {
    private String name;
    private Store store;
    private int count;

    public ToysProbucer(String name, Store store, int count) {
        this.name = name;
        this.store = store;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            store.add(this.name);
        }
    }
}
