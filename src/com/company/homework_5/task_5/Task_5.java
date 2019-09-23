package com.company.homework_5.task_5;

public class Task_5 {
    public static void main(String[] args) {
        int n = 10;
        int a = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + n;
        System.out.println(a); //может я условие не правильно понял?
        /* немного не так. Тебе нужен цикл, в котором ты будешь выполнять это сложение, а 'n' - это твой ограничитель,
        т.е. при n = 3:
        1+2+3
        n = 99:
        1+2+3+...+99
        */
    }
}
