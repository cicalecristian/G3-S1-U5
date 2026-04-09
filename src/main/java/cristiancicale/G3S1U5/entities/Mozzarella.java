package cristiancicale.G3S1U5.entities;

public class Mozzarella extends Topping {
    public Mozzarella(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return pizza.getName() + " + Mozzarella";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 2.0;
    }

    @Override
    public int getCalories() {
        return pizza.getCalories() + 250;
    }
}
