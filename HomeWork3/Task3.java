// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
package HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(i, random.nextInt(10));
        }

        System.out.println(numbers);

        int min = 0;
        int max = 0;
        int sum = 0;        
        
        for (Integer integer : numbers) {
            sum = sum + integer;
            if (integer < min) min = integer;
            if (integer > max) max = integer;             
        }

        System.out.printf("min = %s\nmax = %s\naverage = %s", min, max, sum/numbers.size());
    }
}
