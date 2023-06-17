package oop.lesson4.homework;

import java.util.ArrayList;

public class Box<F extends Fruit> {

    private ArrayList<F> fruits;

    public Box(ArrayList<F> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(F fruit) {
        this.fruits.add(fruit);
    }

    public float getWeight() {
        return (fruits.isEmpty() ? 0 : fruits.size() * fruits.get(0).getWeight());
    }

    public boolean compare(Box box) {
        return (box.getWeight() == this.getWeight());
    }

    public void moveToOtherBox(Box<F> box) {
        System.out.printf("Пересыпаем фрукты из [%s] в [%s]\n", this, box);

        while (!this.fruits.isEmpty()) {
            box.addFruit(this.fruits.remove(0));
        }
    }

    @Override
    public String toString() {
        return String.format("%s, в коробке: %d, вес: %.2f", fruits.get(0).getName(), fruits.size(), this.getWeight());
    }

}
