package br.com.ricardosn.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prb002Test {

    private Prb002 prb002;

    @BeforeEach
    public void setUp() throws Exception {
        prb002 = new Prb002();
    }

    @Test
    @DisplayName("Sum of multiples of 3 and 5 of numbers below 1000 must be 233168")
    void testFibonacciEven() {
        assertEquals(1, prb002.run());
    }
}