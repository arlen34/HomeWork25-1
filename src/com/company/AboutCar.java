package com.company;

import lombok.*;

@Data
public class AboutCar {
    private int yearOfIssue;
    private String model;
    private int price;
    private String color;


    public AboutCar(int yearOfIssue, String model, int price, String color) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ClassVal{" +
                "yearOfIssue=" + yearOfIssue +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
