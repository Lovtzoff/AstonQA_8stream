package ru.aston;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        phoneBook.computeIfAbsent(lastName, k -> new HashSet<>()).add(phoneNumber);
    }

    public Set<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new HashSet<>());
    }
}

