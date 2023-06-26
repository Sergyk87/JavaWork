package oop.lesson7.observer;

import java.util.Random;

public class Manager implements Observer {

    private static Random random = new Random();

    private String name;

    private VacancyType vacancyType;

    private double minSalary;

    public Manager(String name, VacancyType vacancyType, double minSalary) {
        this.name = name;
        this.vacancyType = vacancyType;
        minSalary = random.nextDouble(80000, 100000);
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (vacancyType == vacancy.getVacanceName())
            if (minSalary <= vacancy.getMaxSalary()) {
                System.out.printf("Менеджер %s (%.2f) >>> Мне нужна эта работа! (%s %s - %.2f)\n",
                        name, minSalary, nameCompany, vacancy.getVacanceName(), vacancy.getMaxSalary());
                minSalary = vacancy.getMaxSalary();
            } else {
                System.out.printf("Менеджер %s (%.2f) >>> Я найду работу получше! (%s %s - %.2f)\n",
                        name, minSalary, nameCompany, vacancy.getVacanceName(), vacancy.getMaxSalary());
            }
        else {
            System.out.printf("Менеджер %s (%.2f) >>> Вакансия %s от компании %s - %.2f мне не подходит)\n",
                    name, minSalary, nameCompany, vacancy.getVacanceName(), vacancy.getMaxSalary());
        }
    }
}
