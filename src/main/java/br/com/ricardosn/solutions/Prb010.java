package br.com.ricardosn.solutions;

import br.com.ricardosn.utils.Lib;

public final class Prb010 {

    private static int VALUE = 2000000;

    public static void main(String[] args) {
        System.out.println(new Prb010().run(VALUE));
    }

    public long run(int n) {
        long sum = 0;

        int[] result = Lib.listPrimes(n);

        for(int r : result) {
            sum += r;
        }

        return sum;
    }

}
