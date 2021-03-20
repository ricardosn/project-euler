package br.com.ricardosn.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prb001Test {

    private Prb001 prb001;

    @BeforeEach
    public void setUp() throws Exception {
        prb001 = new Prb001();
    }

    @Test
    @DisplayName("Sum of multiples of 3 and 5 of numbers below 1000 must be 233168")
    void testMultiples3And5() {
        assertEquals(233168, prb001.run(), "Sum of multiples of 3 and 5 of numbers below 1000 must be 233168");
    }
}