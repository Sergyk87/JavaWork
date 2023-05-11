// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package HomeWork5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static Map<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook(iScanner(null));
    }

    public static void addInPhoneBook() {
        phoneBook.put("Иванов", List.of("123"));
        phoneBook.put("Васильев", List.of("234", "965"));
        phoneBook.put("Петрова", List.of("345"));
        phoneBook.put("Иванова", List.of("678", "756", "525"));
    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }

    public static String iScanner(String surname) {
        try (Scanner iScanner = new Scanner(System.in, "866")) {
            System.out.printf("Введите Фамилию: ");
            String surName = iScanner.nextLine();
            return surName;
        }

    }
}
