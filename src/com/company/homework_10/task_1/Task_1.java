package com.company.homework_10.task_1;

        import java.util.ArrayList;

// форматируй код
public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        people.add("Mark");
        people.add("Alice");
        people.add("Tom");
        people.add("Sam");
        people.add("Nik");

            // имя с консоли
        if (people.contains("Nik")) {
            System.out.println("Есть в списке");
        }else {
            System.out.println("Нет в списке");
        }

    }
}
