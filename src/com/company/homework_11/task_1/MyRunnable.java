package com.company.homework_11.task_1;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
