package ru.aston.task1;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
        } else {
            System.out.println("В миске недостаточно еды.");
        }
    }

    public void addFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.println("В миске осталось " + food + " еды.");
    }
}

