package ru.aston;

import java.util.Arrays;
import java.util.Random;

import static ru.aston.InitialData.*;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[ARRAY_SIZE];
        Random random = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            employees[i] = new Employee(ARRAY_LAST_NAME[i],
                    ARRAY_FIRST_NAME[i],
                    ARRAY_MIDDLE_NAME[i],
                    ARRAY_POSITION[i],
                    ARRAY_EMAIL_ID[i] + "@example.com",
                    generateBelarusPhoneNumber(random),
                    ARRAY_SALARY[i],
                    ARRAY_AGE[i]);
        }

        Arrays.stream(employees).forEach(Employee::informationOutput);

        Park.Attraction attraction = new Park.Attraction("ВАЛЬС", "10:00 - 18:00", 5.00);
        attraction.informationOutput();
    }

    private static String generateBelarusPhoneNumber(Random random) {
        StringBuilder phoneNumber = new StringBuilder("+37529");
        for (int i = 0; i < 7; i++) {
            phoneNumber.append(random.nextInt(10));
        }
        return phoneNumber.toString();
    }
}