package com.company.homework_7.task_4;

import java.io.Serializable;

// у тебя есть поле Work, а наследование здесь стоит убрать + наследование некорректно по отношению к Employee
public class Employee extends Work implements Serializable {
    private String name;
    private int age;
    private Work work;

    // public Employee(String title, int experience, Work work) - например так
    public Employee(String title, int experience) {
        super(title, experience);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}
