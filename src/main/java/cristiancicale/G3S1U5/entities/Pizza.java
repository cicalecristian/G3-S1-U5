package cristiancicale.G3S1U5.entities;

import cristiancicale.G3S1U5.interfaces.MenuItem;

public abstract class Pizza implements MenuItem {
    @Override
    public abstract String getName();

    @Override
    public abstract double getPrice();

    @Override
    public abstract int getCalories();
}
