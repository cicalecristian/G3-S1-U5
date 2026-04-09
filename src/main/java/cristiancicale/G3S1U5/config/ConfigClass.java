package cristiancicale.G3S1U5.config;

import cristiancicale.G3S1U5.entities.*;
import cristiancicale.G3S1U5.enums.StatoOrdine;
import cristiancicale.G3S1U5.enums.StatoTavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.List;

@Configuration
public class ConfigClass {
    @Value("${coperto.price}")
    private double coperto;

    @Bean
    public Pizza margherita() {
        return new Margherita();
    }

    @Bean
    public Pizza PizzaTradizionale() {
        return new FiorDiLatte(new Margherita());
    }

    @Bean
    public Pizza PizzaMozzarella() {
        return new Mozzarella(new Margherita());
    }

    @Bean
    public Pizza PizzaProvola() {
        return new Provola(new Margherita());
    }

    @Bean
    public Drink cocaCola() {
        return new Drink("Coca Cola", 2.5, 150);
    }

    @Bean
    public Drink acqua() {
        return new Drink("Acqua", 1.0, 0);
    }

    @Bean
    public Menu menu() {
        return new Menu(
                List.of(margherita(), PizzaTradizionale(), PizzaMozzarella(), PizzaProvola()),
                List.of(cocaCola(), acqua())
        );
    }

    @Bean
    public Tavolo table1() {
        return new Tavolo(1, 4, StatoTavolo.LIBERO);
    }

    @Bean
    public Ordine order1(Menu menu, Tavolo table1) {
        return new Ordine(
                1,
                table1,
                List.of(
                        margherita(),
                        cocaCola()
                ),
                StatoOrdine.IN_CORSO,
                3,
                LocalTime.of(21, 30),
                coperto
        );
    }

    @Bean
    public Tavolo table2() {
        return new Tavolo(2, 6, StatoTavolo.OCCUPATO);
    }

    @Bean
    public Ordine order2(Menu menu, Tavolo table2) {
        return new Ordine(
                2,
                table2,
                List.of(
                        PizzaTradizionale(),
                        PizzaProvola(),
                        acqua()
                ),
                StatoOrdine.SERVITO,
                4,
                LocalTime.of(20, 15),
                coperto
        );
    }
}
