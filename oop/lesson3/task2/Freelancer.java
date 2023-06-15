package oop.lesson3.task2;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего
 * задания. +
 * *20*8
 */
public class Freelancer extends Employee {
    public Freelancer(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary * 20 * 8;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s; лет: %d; Фрилансер; Среднемесячная заработная плата (почасовая оплата): %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}
