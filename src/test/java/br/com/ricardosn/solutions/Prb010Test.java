package br.com.ricardosn.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prb010Test {

    public static final long EXPECTED = 142913828922L;
    public static final int N = 2000000;
    private Prb010 prb010;

    @BeforeEach
    public void setUp() {
        prb010 = new Prb010();
    }

    @Test
    @DisplayName("Sum of primes below two million must be 142913828922")
    void testSumOfTwoMillionPrimes() {
        assertEquals(EXPECTED, prb010.run(N));
    }
}