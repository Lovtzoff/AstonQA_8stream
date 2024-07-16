package ru.aston;

import ru.aston.task1.Animal;
import ru.aston.task1.Cat;
import ru.aston.task1.Dog;
import ru.aston.task1.Plate;
import ru.aston.task2.Circle;
import ru.aston.task2.Rectangle;
import ru.aston.task2.Triangle;

import java.util.Arrays;

public class TasksSolver {

    public void getTask1() {
        System.out.println("\nTASK 1");
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Васек");
        Dog dog1 = new Dog("Рекс");
        Dog dog2 = new Dog("Тузик");
        Dog dog3 = new Dog("Бобик");

        cat1.info();
        cat1.run(150);
        cat1.swim(3);

        cat2.info();
        cat2.run(230);
        cat2.swim(6);

        dog1.info();
        dog1.run(300);
        dog1.swim(5);

        dog2.info();
        dog2.run(600);
        dog2.swim(7);

        dog3.info();
        dog3.run(250);
        dog3.swim(15);

        System.out.println();
        Cat[] cats = new Cat[3];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Кот" + (i + 1));
        }
        Plate plate = new Plate(35);
        Arrays.stream(cats).forEach(cat -> cat.eat(plate, 15));
        plate.info();
        Arrays.stream(cats).forEach(Cat::isFull);

        System.out.println();
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Общее количество животных: " + Animal.getAnimalCount());
    }

    public void getTask2() {
        System.out.println("\nTASK 2");

        Circle circle = new Circle("Красный", "Черный", 6);
        Rectangle rectangle = new Rectangle("Синий", "Зеленый", 4, 6);
        Triangle triangle = new Triangle("Желтый", "Фиолетовый", 3, 4, 5);

        circle.printDetails();
        rectangle.printDetails();
        triangle.printDetails();
    }
}

