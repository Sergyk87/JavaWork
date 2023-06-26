package oop.lesson7.observer;

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google",jobAgency);
        Company yandex = new Company("Yandex",jobAgency);

        Vacancy courier = new Vacancy(VacancyType.Курьер, 6000);
        Vacancy cleaner = new Vacancy(VacancyType.Уборщик, 11000);
        Vacancy programmer = new Vacancy(VacancyType.Программист, 95000);

        Master ivanov = new Master("Ivanov", VacancyType.Программист, 90000);
        Master petrov = new Master("Petrov", VacancyType.Программист, 100000);
        Student sidorov = new Student("Sidorov", 3500);
        Manager suvorov = new Manager("Suvorov", VacancyType.Уборщик, 10000);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(suvorov);

        geekBrains.needEmployee(programmer);
        google.needEmployee(cleaner);
        yandex.needEmployee(courier);

    }

}
