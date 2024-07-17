package ru.aston;

public class Main {

    private static final String[][] ARRAY_1 = new String[][]{{"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}};
    private static final String[][] ARRAY_2 = new String[][]{{"1", "2"},
            {"3", "4"}};
    private static final String[][] ARRAY_3 = new String[][]{{"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "x", "11", "12"},
            {"13", "14", "15", "16"}};

    public static void main(String[] args) {
        try {
            System.out.println("Массив ARRAY_1");
            int sum1 = TasksSolver.sumArrayElements(ARRAY_1);
            System.out.println("Сумма элементов массива: " + sum1);

            System.out.println("\nМассив ARRAY_2");
            int sum2 = TasksSolver.sumArrayElements(ARRAY_2);
            System.out.println("Сумма элементов массива: " + sum2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            try {
                System.out.println("\nМассив ARRAY_3");
                int sum3 = TasksSolver.sumArrayElements(ARRAY_3);
                System.out.println("Сумма элементов массива: " + sum3);
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}