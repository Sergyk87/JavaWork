package oop.lesson4.homework;

import java.util.ArrayList;

public class Program {

    /**
     * Домашняя работа, задача:
     * ========================
     * 
     * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;               +
     * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются   +
     * по типу фрукта,                                                                +
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;                   +
     * c. Для хранения фруктов внутри коробки можно использовать ArrayList;           +
     * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес        +
     * одного фрукта и их количество:                                                 +
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);              +
     * e. Внутри класса Box сделать метод compare(), который позволяет сравнить       +
     * текущую коробку с той, которую                                                 +
     * подадут в compare() в качестве параметра. true – если их массы равны, false в  +
     * противоположном случае.                                                        +
     * Можно сравнивать коробки с яблоками и апельсинами;                             +
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в    +
     * другую.                                                                        +
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с              +
     * апельсинами.                                                                   +
     * Соответственно, в текущей коробке фруктов не остается, а в другую              +
     * перекидываются объекты, которые были в первой;                                 +
     * g. Не забываем про метод добавления фрукта в коробку.                          +
     */
    public static void main(String[] args) {

        Box<Apple> boxApple = new Box<>(new ArrayList<>());
        Box<Apple> boxApple1 = new Box<>(new ArrayList<>());

        Apple apple = new Apple();

        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);

        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);

        System.out.println(boxApple);
        System.out.println(boxApple1);

        Box<Orange> boxOrange = new Box<>(new ArrayList<>());

        Orange orange = new Orange();

        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        System.out.println(boxOrange);

        System.out.println(boxApple.compare(boxOrange));

        boxApple.moveToOtherBox(boxApple1);
        System.out.printf("Стало: [%s]", boxApple1);

    }

}
