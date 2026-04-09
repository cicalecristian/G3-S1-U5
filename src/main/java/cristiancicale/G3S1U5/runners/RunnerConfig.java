package cristiancicale.G3S1U5.runners;

import cristiancicale.G3S1U5.entities.Menu;
import cristiancicale.G3S1U5.entities.Ordine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class RunnerConfig implements CommandLineRunner {

    private Menu menu;
    private Ordine order1;
    private Ordine order2;

    public RunnerConfig(Menu menu, Ordine order1, Ordine order2) {
        this.menu = menu;
        this.order1 = order1;
        this.order2 = order2;
    }

    @Override
    public void run(String... args) throws Exception {

        menu.printMenu();

        System.out.println(" ");
        System.out.println(order1);

        System.out.println(" ");
        System.out.println(order2);
    }
}
