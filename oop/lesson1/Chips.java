package oop.lesson1;

public class Chips extends Product {

    private String taste; // вкус
    private double weight; // вес

    public Chips(String brand, String name, double price, String taste, double weight) {
        super(brand, name, price);
        this.taste = taste;
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("[Упаковка] %s - %s - %f [вкус: %s; вес: %f]", brand, name, price, taste, weight);
    }
}
