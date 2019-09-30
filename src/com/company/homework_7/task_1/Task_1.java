package com.company.homework_7.task_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task_1 {

    private static final String PATH = "srs/com/company/homework_7/task_1/text";
    public static void main(String[] args) {
        byte[] buf = {1, 2, 3, 4, 5, 6, 9};
       try(FileOutputStream fos = new FileOutputStream(PATH)) {

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
