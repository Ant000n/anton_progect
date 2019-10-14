package com.company.homework_11.task_3;

public class Task_3 {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store(150);

        ToysProbucer luntikToy = new ToysProbucer("luntik", store, 100);
        ToysProbucer cheburashkaToy = new ToysProbucer("cheburashka", store, 50);

        Thread luntik = new Thread(luntikToy);
        Thread cheburashka = new Thread(cheburashkaToy);

        luntik.start();
        cheburashka.start();

        luntik.join();
        cheburashka.join();

        System.out.println(store.getToys().size());
    }
}
