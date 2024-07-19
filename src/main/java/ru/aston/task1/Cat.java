package ru.aston.task1;

public class Cat extends Animal {

    private static int catCount = 0;
    private final int MAX_RUN_LENGTH = 200;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        catCount++;
        isFull = false;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void run(int length) {
        System.out.println((length <= MAX_RUN_LENGTH) ?
                (super.getName() + " пробежал " + length + " м.") :
                (super.getName() + " не может пробежать " + length + " м."));
    }

    public void swim(int length) {
        System.out.println(super.getName() + " не умеет плавать.");
    }

    @Override
    public String toString() {
        return "\nКот" + super.toString();
    }

    public void info() {
        System.out.println(this);
    }

    public void eat(Plate plate, int amount) {
        if (!isFull && amount <= plate.getFood()) {
            plate.decreaseFood(amount);
            isFull = true;
            System.out.println(super.getName() + " наелся.");
        } else {
            System.out.println(super.getName() + " не наелся из миски.");
        }
    }

    public void isFull() {
        System.out.println((isFull) ? (super.getName() + " - сытый.") : (super.getName() + " - голодный."));
    }
}

