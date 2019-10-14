package com.company.homework_11.task_1;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 10 - лучше передавать в конструкторе
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
