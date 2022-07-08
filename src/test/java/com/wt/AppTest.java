package com.wt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.wt.App.*;

public class AppTest {
    @Test
    @DisplayName("check: entering 0 returns \"0\"")
    void checkEntering0Returns0() {
        assertEquals("0", playPlingPlangPlong(0));
    }

    @Test
    @DisplayName("check: entering 3 returns \"Pling\"")
    void checkEntering3ReturnsPling() {
        assertEquals("Pling", playPlingPlangPlong(3));
    }

    @Test
    @DisplayName("check: entering 5 returns \"Plang\"")
    void checkEntering5ReturnsPlang() {
        assertEquals("Plang", playPlingPlangPlong(5));
    }

    @Test
    @DisplayName("check: entering 7 returns \"Plong\"")
    void checkEntering7ReturnsPlong() {
        assertEquals("Plong", playPlingPlangPlong(7));
    }

    @Test
    @DisplayName("check: entering a number with 3 and 5 as factors returns \"PlingPlang\"")
    void checkEnteringANumberWith3And5AsFactorsReturnsPlingPlang() {
        assertEquals("PlingPlang", playPlingPlangPlong(15));
    }

    @Test
    @DisplayName("check: entering a number with 3 and 7 as factors returns \"PlingPlong\"")
    void checkEnteringANumberWith3And7AsFactorsReturnsPlingPlong() {
        assertEquals("PlingPlong", playPlingPlangPlong(21));
    }

    @Test
    @DisplayName("check: entering a number with 5 and 7 as factors returns \"PlangPlong\"")
    void checkEnteringANumberWith5And7AsFactorsReturnsPlangPlong() {
        assertEquals("PlangPlong", playPlingPlangPlong(35));
    }

    @Test
    @DisplayName("check: entering a number with 3, 5 and 7 as factors returns \"PlingPlangPlong\"")
    void checkEnteringANumberWith35And7AsFactorsReturnsPlingPlangPlong() {
        assertEquals("PlingPlangPlong", playPlingPlangPlong(7 * 5 * 3));
    }

    @Test
    @DisplayName("check: entering Integer.MINVALUE returns Integer.MINVALUE")
    void checkEnteringIntegerMinvalueReturnsIntegerMinvalue() {
        assertEquals("" + Integer.MIN_VALUE, playPlingPlangPlong(Integer.MIN_VALUE));
    }

    @Test
    @DisplayName("check: entering Integer.MAXVALUE returns Integer.MAXVALUE")
    void checkEnteringIntegerMaxvalueReturnsIntegerMaxvalue() {
        assertEquals("" + Integer.MAX_VALUE, playPlingPlangPlong(Integer.MAX_VALUE));
    }
}
