package br.com.ricardosn.utils;

public final class Lib {

    public static int[] listPrimes(int n) {
        boolean[] isPrime = sieveOfEratosthenes(n);
        int count = 0;
        for (boolean b : isPrime) {
            if (b)
                count++;
        }

        int[] result = new int[count];
        for (int i = 0, j = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }

    public static boolean[] sieveOfEratosthenes(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Negative array size");

        // Init result with every element that is not multiple of 2 marked true, except 2 itself (because it`s a prime)
        boolean[] result = new boolean[n + 1];

        if (n >= 2)
            result[2] = true;
        for (int i = 3; i <= n; i += 2)
            result[i] = true;

        // Sieve of Eratosthenes
        for (int i = 3, end = (int)Math.sqrt(n); i <= end; i += 2) {
            if (result[i]) {
                for (int j = i * i, inc = i * 2; j <= n; j += inc)
                    result[j] = false;
            }
        }
        return result;
    }

}
