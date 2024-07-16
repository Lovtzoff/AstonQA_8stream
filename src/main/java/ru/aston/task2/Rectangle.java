package ru.aston.task2;

import java.util.Locale;

public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle(String fillColor, String borderColor, double width, double height) {
        super(fillColor, borderColor);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Прямоугольник[" +
                "Ширина: " + width +
                ", Высота: " + height +
                ", Периметр: " + String.format(Locale.ROOT, "%.2f", calculatePerimeter()) +
                ", Площадь: " + String.format(Locale.ROOT, "%.2f", calculateArea()) +
                ", Цвет заливки: " + super.getFillColor() +
                ", Цвет границы: " + super.getBorderColor() +
                "]";
    }
}
