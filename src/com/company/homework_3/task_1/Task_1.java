package com.company.homework_3.task_1;

public class Task_1 {

        private String name;
        private Integer age;

        public Task_1(){

            this("Name", 45);

            System.out.println("constructor");
        }

        public Task_1(String name, Integer age) {

            System.out.println("Name and age");

            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println(name);
        }

        public Integer incrementAge() {
            return age;
        }

        public String toString() {
            System.out.println("Name = " + name);
            return null;
        }

}
