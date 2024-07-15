package ru.aston.task1;

public abstract class Animal implements Movable {

    public String name;
    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    @Override
    public String toString() {
        return "\nИмя: " + name;
    }
}

