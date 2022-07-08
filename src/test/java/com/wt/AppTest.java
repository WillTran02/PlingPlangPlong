package com.wt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    @DisplayName("check: entering 0 returns 0")
    void checkEntering0Returns0() {
        assertEquals("0", App.playPlingPlangPlong(0));
    }
}
