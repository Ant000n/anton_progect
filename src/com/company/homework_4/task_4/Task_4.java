package com.company.homework_4.task_4;

public class Task_4 {
    public static void main(String[] args) {
        // task_4 -> text
        String task_4 = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";
            System.out.println("Есть ли слово 'alert' в тексте? = " + task_4.contains("alert"));
        System.out.println("Есть ли слово 'add' в тексте? = " + task_4.contains("add"));
        System.out.println("Есть ли слово 'good' в тексте? = " + task_4.contains("good"));
        System.out.println("Есть ли слово 'plan' в тексте? = " + task_4.contains("plan"));
        
        // осталось только посчитать кол-во повторений
    }
}
