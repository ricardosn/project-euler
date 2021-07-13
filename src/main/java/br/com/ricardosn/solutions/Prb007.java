package br.com.ricardosn.solutions;

import br.com.ricardosn.utils.Lib;

public final class Prb007 {

    private static final int PRIME_NUMBER_TIMES = 10001;

    public static void main(String[] args) {
        System.out.println(new Prb007().run(PRIME_NUMBER_TIMES));
    }

    public int run(int primeNumberPosition) {
        int x = 1;
        int countFindPrime = 0;

        while(countFindPrime < primeNumberPosition) {
            x++;

            if(Lib.isPrime(x))
                countFindPrime++;
        }

        return x;
    }
}
