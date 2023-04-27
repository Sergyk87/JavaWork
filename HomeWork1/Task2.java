// Вывести все простые числа от 1 до 1000

package HomeWork1;

public class Task2 {
    public static void main(String[] arg) {
        int n = 1000;
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j < i && flag == true; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.printf("%d ", i);
            }
        }
    }
}
