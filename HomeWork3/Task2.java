// Пусть дан произвольный список целых чисел. Удалить из него чётные числа

package HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(i, random.nextInt(10));
        }
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0)
                numbers.remove(i--);
        }

        System.out.println(numbers);

    }
}
