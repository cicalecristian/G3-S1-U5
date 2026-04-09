package cristiancicale.G3S1U5.entities;

import cristiancicale.G3S1U5.interfaces.MenuItem;

public class Drink implements MenuItem {
    private final String name;
    private final double price;
    private final int calories;

    public Drink(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
