package com.company.homework_10.task_5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Date startArrays = new Date();
        for(int i = 0; i < 100_000; i++) {
        }
        
        /*
        while(arrayList.size > 0) {
        arrayList.remove(arrayList.size/2);
        }
        */
        Date finishArrays = new Date();
        long arrayTime = finishArrays.getTime() - startArrays.getTime();
    }
}
