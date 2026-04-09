package cristiancicale.G3S1U5.entities;

public class FiorDiLatte extends Topping {
    public FiorDiLatte(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return pizza.getName() + " + Fior di latte";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.5;
    }

    @Override
    public int getCalories() {
        return pizza.getCalories() + 200;
    }
}
