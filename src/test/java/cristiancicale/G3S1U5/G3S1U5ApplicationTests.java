package cristiancicale.G3S1U5;

import cristiancicale.G3S1U5.entities.Ordine;
import cristiancicale.G3S1U5.entities.Tavolo;
import cristiancicale.G3S1U5.enums.StatoOrdine;
import cristiancicale.G3S1U5.enums.StatoTavolo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void contieneIProdotti() {
        assertNotNull(order2.getItems());
        assertEquals(3, order2.getItems().size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"OCCUPATO", "LIBERO"})
    public void accettaGliStatiDeiTavoliDisponibili(String stato) {
        assertDoesNotThrow(() -> {
            StatoTavolo.valueOf(stato);
        });
    }

    @ParameterizedTest
    @CsvSource({"IN_CORSO, true",
            "PRONTO, true",
            "SERVITO, true",
            "ANNULLATO, false"
    })
    public void accettaGliStatiDegliOrdiniDisponibili(String stati, boolean expectedResult) {
        assertEquals(expectedResult, isValidStato(stati));
    }

    public boolean isValidStato(String stato) {
        try {
            StatoOrdine.valueOf(stato);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
