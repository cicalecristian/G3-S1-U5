package cristiancicale.G3S1U5.entities;

import cristiancicale.G3S1U5.enums.StatoOrdine;
import cristiancicale.G3S1U5.interfaces.MenuItem;

import java.time.LocalTime;
import java.util.List;

public class Ordine {

    private final int numeroOrdine;
    private final Tavolo tavolo;
    private final List<MenuItem> items;
    private final StatoOrdine statoOrdine;
    private final int coperti;
    private final LocalTime oraAcquisizione;
    private final double costoCoperto;

    public Ordine(int numeroOrdine, Tavolo tavolo, List<MenuItem> items, StatoOrdine statoOrdine, int coperti, LocalTime oraAcquisizione, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.items = items;
        this.statoOrdine = statoOrdine;
        this.coperti = coperti;
        this.oraAcquisizione = oraAcquisizione;
        this.costoCoperto = costoCoperto;
    }

    public double getTotale() {
        double totaleItems = items.stream()
                .mapToDouble(MenuItem::getPrice)
                .sum();

        return totaleItems + (coperti * costoCoperto);
    }

    @Override
    public String toString() {
        return "ORDINE #" + numeroOrdine +
                "\nTavolo: " + tavolo.getNumero() +
                "\nCoperti: " + coperti +
                "\nStato: " + statoOrdine +
                "\nOra: " + oraAcquisizione +
                "\nTotale: €" + getTotale();
    }
}
