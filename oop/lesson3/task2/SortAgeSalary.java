package oop.lesson3.task2;

import java.util.Comparator;

public class SortAgeSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAge() == o2.getAge())
            return 0;
        else if (o1.getSalary() > o2.getSalary())
            return 1;
        else
            return -1;
    }
}