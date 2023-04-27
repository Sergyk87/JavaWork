// Реализовать простой калькулятор

package HomeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] arg) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("введите первое число");
        int n = iScanner.nextInt();
        System.out.println("выберите дествие");
        String operator = iScanner.next();
        System.out.println("введите второе число");
        int m = iScanner.nextInt();
        iScanner.close();

        switch (operator) {
            case "+":
                System.out.printf("Сумма равна %d", n + m);
                break;
            case "-":
                System.out.printf("Разность равна %d", n - m);
                break;
            case "*":
                System.out.printf("Произведение равно %d", n * m);
                break;
            case "/":
                System.out.printf("Частное равно %d", n / m);
                break;
        }
    }
}
