package ru.aston.task1;

public abstract class Animal {

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

    public abstract void run(int length);
    public abstract void swim(int length);

    @Override
    public String toString() {
        return "\nИмя: " + name;
    }
}

