/* Задача 4.
* Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
* который запишет эту строку в простой текстовый файл, обработайте исключения.
*/

package Second2;

import java.io.FileWriter;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        String text = "TEXT";
        int repeat = 100;
        String result = strRepeat(text, repeat);
        System.out.println(result);
        writeToFile(result);
    }

    private static String strRepeat(String word, int count) {
        // StringBuilder result = new StringBuilder();

        // result.append(word.repeat(count)); // Эквивалент умножения строк, как для
        // Python.

        // result.append(String.valueOf(word).repeat(Math.max(0, count)));
        //
        // for (int i = 0; i < count; i++) {
        // result.append(word);
        // }
        // return result.toString();
        return word.repeat(count);
    }

    private static void writeToFile(String text) {
        try (FileWriter writer = new FileWriter("text.txt")) {
            writer.append(text);
        } catch (IOException ex) {
            System.out.println("Ошибка записи в файл!");
        }
    }
}
