package com.company;

import lombok.*;

@Data
public class Car {
    private int id,number;
    private Number number1;

    public Car(int id, int number) {
        this.id = id;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{ " +
                "id= " + id +
                ", number= " + number +
                '}';
    }
}
