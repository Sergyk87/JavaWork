package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {

        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume) {

        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                if (((BottleOfWater) product).getVolume() == volume) {
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }

    public Chips getChips(double weight) {

        for (Product product : products) {
            if (product instanceof Chips) {
                if (((Chips) product).getWeight() == weight) {
                    return (Chips) product;
                }
            }
        }
        return null;
    }

}
