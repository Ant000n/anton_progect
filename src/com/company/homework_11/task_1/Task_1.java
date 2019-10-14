package com.company.homework_11.task_1;

// +
public class Task_1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        thread.join();
    }
}
