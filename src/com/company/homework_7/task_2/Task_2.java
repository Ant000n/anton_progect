package com.company.homework_7.task_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task_2 {
    private static final String PATH = "src/com/company/homework_7/task_2/text";

    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream(PATH, true)) {
            String text = "Hello World";
            for (int i = 0; i <= 1000_000; i++) {
                fos.write(text.getBytes());
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
