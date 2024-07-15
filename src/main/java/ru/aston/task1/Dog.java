package ru.aston.task1;

public class Dog extends Animal {

    private static int dogCount = 0;
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int length) {
        System.out.println((length <= MAX_RUN_LENGTH) ?
                (super.getName() + " пробежал " + length + " м.") :
                (super.getName() + " не может пробежать " + length + " м."));
    }

    @Override
    public void swim(int length) {
        System.out.println((length <= MAX_SWIM_LENGTH) ?
                (super.getName() + " проплыл " + length + " м.") :
                (super.getName() + " не может проплыть " + length + " м."));
    }

    @Override
    public String toString() {
        return "\nСобака" + super.toString();
    }

    public void info() {
        System.out.println(this);
    }
}
