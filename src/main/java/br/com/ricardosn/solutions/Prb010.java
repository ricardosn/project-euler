package br.com.ricardosn.solutions;

import utils.Lib;

public final class Prb010 {

    private static int MAX_VALUE = 2000000;

    public static void main(String[] args) {
        System.out.println(new Prb010().run());
    }

    public long run() {
        long sum = 0;

        int[] result = Lib.listPrimes(MAX_VALUE);

        for(int r : result) {
            sum += r;
        }

        return sum;
    }

}
