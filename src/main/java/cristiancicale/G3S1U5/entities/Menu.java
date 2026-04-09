package cristiancicale.G3S1U5.entities;

import java.util.List;

public class Menu {
    private final List<Pizza> pizze;
    private final List<Drink> drinks;

    public Menu(List<Pizza> pizze, List<Drink> drinks) {
        this.pizze = pizze;
        this.drinks = drinks;
    }

    public void printMenu() {
        System.out.println("MENU PIZZERIA");

        System.out.println("\nPIZZE:");
        for (Pizza p : pizze) {
            System.out.println(p.getName() + " - €" + p.getPrice() + " - " + p.getCalories() + " kcal");
        }

        System.out.println("\nBEVANDE:");
        for (Drink d : drinks) {
            System.out.println(d.getName() + " - €" + d.getPrice() + " - " + d.getCalories() + " kcal");
        }
    }
}
