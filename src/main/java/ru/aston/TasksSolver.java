package ru.aston;

import java.util.*;
import java.util.stream.Stream;

public class TasksSolver {

    public static void getTask1() {
        System.out.println("TASK 1");
        String[] words = {"яблоко", "апельсин", "яблоко", "груша", "киви", "киви", "апельсин", "апельсин"};
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordCount = new HashMap<>();
        Stream.of(words).forEach(word -> wordCount.put(word, wordCount.getOrDefault(word, 0) + 1));
        System.out.println("Количество повторений каждого слова: " + wordCount);
    }

    public static void getTask2() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+375291367977");
        phoneBook.add("Петров", "+375299161274");
        phoneBook.add("Иванов", "+375296219380");

        System.out.println("\nTASK 2");
        System.out.println("Номера с фамилией Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Номера с фамилией Петров: " + phoneBook.get("Петров"));
        System.out.println("Номера с фамилией Сидоров: " + phoneBook.get("Сидоров"));
    }
}

