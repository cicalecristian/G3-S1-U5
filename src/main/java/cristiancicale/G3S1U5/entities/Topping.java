package cristiancicale.G3S1U5.entities;

public abstract class Topping extends Pizza {
    protected Pizza pizza;

    public Topping(Pizza pizza) {
        this.pizza = pizza;
    }
}
