package ru.aston.task2;

import java.util.Locale;

public class Circle extends Figure {

    private double radius;

    public Circle(String fillColor, String borderColor, double radius) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Круг [" +
                "Радиус: " + radius +
                ", Периметр: " + String.format(Locale.ROOT, "%.2f", calculatePerimeter()) +
                ", Площадь: " + String.format(Locale.ROOT, "%.2f", calculateArea()) +
                ", Цвет заливки: " + super.getFillColor() +
                ", Цвет границы: " + super.getBorderColor() +
                "]";
    }
}

