/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

package HomeWork2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String[] input = reader.readLine()
                    .replace("{", "")
                    .replace("}", "")
                    .split(",");

            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM students WHERE ");

            for (String s : input) {
                String[] temp = s.trim().split(":");
                if (!temp[1].contains("null")) {
                    sb.append(temp[0].replace("\"", "")).append(" = ").append(temp[1]).append(" AND ");
                }
            }

            sb.replace(sb.lastIndexOf(" AND "), sb.length() - 1, ";");
            System.out.println(sb);
        }
    }
}
