package ru.aston.task2;

public interface FigureInterface {

    double calculatePerimeter();

    double calculateArea();

    default void printDetails() {
        System.out.println(this);
    }
}

