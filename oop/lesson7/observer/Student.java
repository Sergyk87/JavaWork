package oop.lesson7.observer;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Student(String name, double minSalary) {
        this.name = name;
        minSalary = random.nextDouble(2000, 3000);
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (minSalary <= vacancy.getMaxSalary()) {
            System.out.printf("Студент %s (%.2f) >>> Мне нужна эта работа! (%s %s - %.2f)\n",
                    name, minSalary, nameCompany, vacancy.getVacanceName(), vacancy.getMaxSalary());
            minSalary = vacancy.getMaxSalary();
        } else {
            System.out.printf("Студент %s (%.2f) >>> Я найду работу получше! (%s %s - %.2f)\n",
                    name, minSalary, nameCompany, vacancy.getVacanceName(), vacancy.getMaxSalary());
        }
    }
}
