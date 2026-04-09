package cristiancicale.G3S1U5.entities;

import cristiancicale.G3S1U5.enums.StatoTavolo;

public class Tavolo {

    private final int numero;
    private final int maxCoperti;
    private StatoTavolo statoTavolo;

    public Tavolo(int numero, int maxCoperti, StatoTavolo statoTavolo) {
        this.numero = numero;
        this.maxCoperti = maxCoperti;
        this.statoTavolo = statoTavolo;
    }

    public int getNumero() {
        return numero;
    }

    public int getMaxCoperti() {
        return maxCoperti;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }
}
