/*
В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */

package HomeWork2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                line = line.substring(1, line.length() - 2);
                sb.append("SELECT * FROM students WHERE ");

                String[] substrings = line.split(",");
                for (String string : substrings) {
                    String[] temp = string.trim().split(":");
                    if (!temp[1].contains("null")) {
                        sb.append(temp[0].replace("\"", "")).append(" = ").append(temp[1]).append(" AND ");
                    }
                }

                sb.replace(sb.lastIndexOf(" AND "), sb.length() - 1, ";");
                System.out.println(sb);
            }
            br.close();

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
