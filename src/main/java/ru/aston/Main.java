package ru.aston;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Random random = new Random();

        employees[0] = new Employee("Иванов",
                "Иван",
                "Петрович",
                "Менеджер",
                "ivanov@example.com",
                generateBelarusPhoneNumber(random),
                1500.94,
                35);
        employees[1] = new Employee("Петров",
                "Петр",
                "Иванович",
                "Разработчик",
                "petrov@example.com",
                generateBelarusPhoneNumber(random),
                2000.74,
                30);
        employees[2] = new Employee("Сидоров",
                "Александр",
                "Сергеевич",
                "Дизайнер",
                "sidorov@example.com",
                generateBelarusPhoneNumber(random),
                1200.43,
                28);
        employees[3] = new Employee("Козлова",
                "Елена",
                "Алексеевна",
                "Бухгалтер",
                "kozlova@example.com",
                generateBelarusPhoneNumber(random),
                1800.51,
                40);
        employees[4] = new Employee("Новикова",
                "Ольга",
                "Михайловна",
                "Тестировщик",
                "novikova@example.com",
                generateBelarusPhoneNumber(random),
                1300.34,
                27);

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