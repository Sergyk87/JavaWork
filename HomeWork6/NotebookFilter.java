// 1.Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
// 2.Создать множество ноутбуков.
// 3.Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package HomeWork6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NotebookFilter {
    public static void main(String[] args) {

        Set<Laptop> notebooks = new HashSet<>();

        notebooks.add(new Laptop("Dell", 8, 128, "Windows10", "black"));
        notebooks.add(new Laptop("Acer", 32, 512, "Windows11", "blue"));
        notebooks.add(new Laptop("HP", 16, 256, "Windows10", "black"));
        System.out.println();
        System.out.println(notebooks);

        Map<String, Object> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println(
                "1 - Объем ОЗУ (не менее)\n" + "2 - Объем ЖД (не менее)\n" + "3 - Операционная система\n" +
                        "4 - Цвет\n" + "Введите цифру, соответствующую необходимому критерию:");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int minRam = scanner.nextInt();
                filters.put("ram", minRam);
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int minHdd = scanner.nextInt();
                filters.put("storage", minHdd);
                break;
            case 3:
                System.out.println("Введите требуемую операционную систему:");
                String requiredOs = scanner.nextLine();
                filters.put("os", requiredOs);
                break;
            case 4:
                System.out.println("Введите требуемый цвет:");
                String requiredColor = scanner.nextLine();
                filters.put("color", requiredColor);
                break;
        }
        scanner.close();

        Set<Laptop> filteredLaptops = filterLaptops(notebooks, filters);

        if (filteredLaptops.isEmpty()) {
            System.out.println("Подходящие ноутбуки не найдены.");
        } else {
            System.out.println("Подходящий ноутбук(и):");
            for (Laptop notebook : filteredLaptops) {
                System.out.println(notebook.getModel());
            }
        }
    }

    private static Set<Laptop> filterLaptops(Set<Laptop> notebooks, Map<String, Object> filters) {
        Set<Laptop> filteredNotebooks = new HashSet<>();

        for (Laptop notebook : notebooks) {
            boolean matchesFilter = true;

            if (filters.containsKey("ram")) {
                int minRam = (int) filters.get("ram");
                if (notebook.getRam() < minRam) {
                    matchesFilter = false;
                }
            }

            if (filters.containsKey("storage")) {
                int minHdd = (int) filters.get("storage");
                if (notebook.getHdd() < minHdd) {
                    matchesFilter = false;
                }
            }

            if (filters.containsKey("os")) {
                String requiredOs = (String) filters.get("os");
                if (!notebook.getOs().equalsIgnoreCase(requiredOs)) {
                    matchesFilter = false;
                }
            }

            if (filters.containsKey("color")) {
                String requiredColor = (String) filters.get("color");
                if (!notebook.getColor().equalsIgnoreCase(requiredColor)) {
                    matchesFilter = false;
                }
            }

            if (matchesFilter) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }
}
