package cristiancicale.G3S1U5;

import cristiancicale.G3S1U5.entities.Ordine;
import cristiancicale.G3S1U5.entities.Tavolo;
import cristiancicale.G3S1U5.enums.StatoOrdine;
import cristiancicale.G3S1U5.enums.StatoTavolo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class G3S1U5ApplicationTests {

    @Autowired
    private Tavolo table1;

    @Autowired
    private Ordine order2;

    @Autowired
    private Tavolo table2;

    @Test
    @DisplayName("Tavolo1 creato")
    public void vieneCreatoIlTavolo1() {
        assertNotNull(table1);
        assertEquals(1, table1.getNumero());
        assertEquals(4, table1.getMaxCoperti());
        assertEquals(StatoTavolo.LIBERO, table1.getStatoTavolo());
    }

    @Test
    @DisplayName("Ordine2 creato")
    public void vieneCreatoOrdine2() {
        assertNotNull(order2);
        assertEquals(2, order2.getNumeroOrdine());
        assertEquals(StatoOrdine.SERVITO, order2.getStatoOrdine());
        assertEquals(4, order2.getCoperti());
        assertEquals(LocalTime.of(20, 15), order2.getOraAcquisizione());
    }

    @Test
    public void beanCollegati() {
        assertNotNull(order2.getTavolo());
        assertEquals(table2, order2.getTavolo());
    }
}
