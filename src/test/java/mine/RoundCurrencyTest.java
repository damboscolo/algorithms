package mine;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoundCurrencyTest {

    RoundCurrency r = new RoundCurrency();

    @Test
    @DisplayName("Given currency then round")
    public void testRomanToInt() {
        assertEquals(450, r.round(450));
        assertEquals(450, r.round(451));
        assertEquals(450, r.round(452));
        assertEquals(450, r.round(453));
        assertEquals(450, r.round(454));
        assertEquals(455, r.round(455));
        assertEquals(459, r.round(456));
        assertEquals(459, r.round(457));
        assertEquals(459, r.round(458));
        assertEquals(459, r.round(459));
        assertEquals(460, r.round(460));
    }
}