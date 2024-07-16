package ru.aston.task2;

import java.util.Locale;

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String fillColor, String borderColor, double sideA, double sideB, double sideC) {
        super(fillColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public String toString() {
        return "Треугольник[" +
                "Сторона A: " + sideA +
                ", Сторона B: " + sideB +
                ", Сторона C: " + sideC +
                ", Периметр: " + String.format(Locale.ROOT, "%.2f", calculatePerimeter()) +
                ", Площадь: " + String.format(Locale.ROOT, "%.2f", calculateArea()) +
                ", Цвет заливки: " + super.getFillColor() +
                ", Цвет границы: " + super.getBorderColor() +
                ']';
    }
}
