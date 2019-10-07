package com.company.homework_9.task_1;

public class Task_1 {
    public static void main(String[] args) {
//такой класс в отдельный файл
        class Account <T> {
            private T id;

            public Account(T id) {
                this.id = id;
            }

            public T getId() {
                return id;
            }

            public void setId(T id) {
                this.id = id;
            }
        }
    }
    public <T> void showType(T type) {
        System.out.println(type.getClass().getName());
    }
}
