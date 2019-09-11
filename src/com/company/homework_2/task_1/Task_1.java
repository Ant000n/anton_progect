package com.company.homework_2.task_1;


public class Task_1 {
    public static void main(String[] args) {

        int myInt = 5;
//         double myDouble = myInt; - когда идет повышение типа нету необходимости делать явное приведение типа
        
        double myDouble = (double) myInt;
        
        // а теперь надо myInt = myDouble сделать

        System.out.println("myDouble = " + myDouble);
    }
}
