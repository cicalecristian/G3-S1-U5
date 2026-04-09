package cristiancicale.G3S1U5.entities;

public class Margherita extends Pizza {
    @Override
    public String getName() {
        return "Pizza Margherita";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public int getCalories() {
        return 800;
    }
}
