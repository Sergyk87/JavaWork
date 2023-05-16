// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
package HomeWork4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите длинну строки и нажмите enter: ");
        int SIZE = scan.nextInt();

        List<Integer> arrayList = new LinkedList<>();
        List<Integer> newArrayList = new LinkedList<>();
        for (int i = 0; i < SIZE; i++)
            arrayList.add(i);
        System.out.println(arrayList);

        scan.close();

        while (arrayList.size() != 0) {

            for (int i = arrayList.size() - 1; i >= 0; i--)
                newArrayList.add(arrayList.remove(i));
        }
        System.out.println(newArrayList);
    }
}
