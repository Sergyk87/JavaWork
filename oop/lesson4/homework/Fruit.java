package oop.lesson4.homework;

public abstract class Fruit {

    private final float weight;
    private String name;

    public String getName() {
        return name;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
