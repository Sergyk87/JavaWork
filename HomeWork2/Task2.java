/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

package HomeWork2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {
    public static void main(String[] args) throws IOException {

        int[] array = { 12, 3, 64, -5, 6, 3, 21, -11, 12, 99 };
        System.out.println(Arrays.toString(array));
        boolean isSorted = false;
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fileHandler = new FileHandler("log.txt");
        SimpleFormatter sf = new SimpleFormatter();
        fileHandler.setFormatter(sf);
        logger.addHandler(fileHandler);
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }

            }
            logger.info(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }

}