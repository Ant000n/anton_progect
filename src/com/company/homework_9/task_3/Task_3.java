package com.company.homework_9.task_3;

public class Task_3<T, B, C> {
    private T BMB;
    private B Lada;
    private C Garage;

    public Task_3(T BMB, B lada, C garage) {
        this.BMB = BMB;
        Lada = lada;
        Garage = garage;
    }

    public T getBMB() {
        return BMB;
    }

    public void setBMB(T BMB) {
        this.BMB = BMB;
    }

    public B getLada() {
        return Lada;
    }

    public void setLada(B lada) {
        Lada = lada;
    }

    public C getGarage() {
        return Garage;
    }

    public void setGarage(C garage) {
        Garage = garage;
    }
}
