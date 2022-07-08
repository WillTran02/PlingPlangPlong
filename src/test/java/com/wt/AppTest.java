package com.wt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.wt.App.*;

public class AppTest {
    @Test
    @DisplayName("check: entering 0 returns 0")
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
}
