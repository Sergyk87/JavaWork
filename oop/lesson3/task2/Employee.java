package oop.lesson3.task2;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected int age;
    protected double salary; // Ставка заработной платы

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Расчет среднемесячной заработной платы
     * 
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int res = surname.compareTo(o.surname);
        if (res == 0)
            return Double.compare(calculateSalary(), o.calculateSalary());
        else
            return res;
    }
}
