package com.company.homework_7.task_3;

import java.io.*;

// +
public class Task_3 {
    private static final String PATH = "src/com/company/homework_7/task_2/text";

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            int i;
            while ((i = br.read()) != -1) {
                System.out.println(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
