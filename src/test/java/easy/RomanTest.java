package easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanTest {

    Roman r = new Roman();

    @Test
    @DisplayName("Given roman numbers then return value as integer")
    public void testRomanToInt() throws Exception {
        assertEquals(1, r.toInt("I"));
        assertEquals(2, r.toInt("II"));
        assertEquals(3, r.toInt("III"));
        assertEquals(4, r.toInt("IV"));
        assertEquals(5, r.toInt("V"));
        assertEquals(6, r.toInt("VI"));
        assertEquals(7, r.toInt("VII"));
        assertEquals(8, r.toInt("VIII"));
        assertEquals(9, r.toInt("IX"));
        assertEquals(10, r.toInt("X"));
        assertEquals(14, r.toInt("XIV"));
        assertEquals(15, r.toInt("XV"));
        assertEquals(19, r.toInt("XIX"));
        assertEquals(20, r.toInt("XX"));
        assertEquals(40, r.toInt("XL"));
        assertEquals(50, r.toInt("L"));
        assertEquals(90, r.toInt("XC"));
        assertEquals(100, r.toInt("C"));
        assertEquals(400, r.toInt("CD"));
        assertEquals(500, r.toInt("D"));
        assertEquals(900, r.toInt("CM"));
        assertEquals(1000, r.toInt("M"));
        assertEquals(58, r.toInt("LVIII"));
        assertEquals(1994, r.toInt("MCMXCIV"));
    }

    @Test
    @DisplayName("Given invalid roman number then throw an exception")
    public void testInvalidRomanToInt() {
        assertTrue(assertThrows(Exception.class, () -> { r.toInt("DANI");}).getMessage()
                .contains("invalid roman number"));
        assertTrue(assertThrows(Exception.class, () -> { r.toInt("LVIZII");}).getMessage()
                .contains("invalid roman number"));
        assertTrue(assertThrows(Exception.class, () -> { r.toInt("PMCMXCIV");}).getMessage()
                .contains("invalid roman number"));
    }
}