package cristiancicale.G3S1U5.entities;

public class Provola extends Topping {
    public Provola(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return pizza.getName() + " + Provola";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.80;
    }

    @Override
    public int getCalories() {
        return pizza.getCalories() + 220;
    }
}
