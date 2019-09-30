package com.company.homework_7.task_4;

import java.io.*;

public class Task_4 {
    private static final String PATH = "src/com/company/homework_7/task_4/Employee";
    public static void main(String[] args) {
        Employee myEmployee = new Employee("Android", 2);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))) {
           oos.writeObject(myEmployee);
        } catch (Exception e) {
            e.printStackTrace();
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))) {
                final var employee = (Employee) ois.readObject();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }
}
