package br.com.ricardosn.solutions;

public final class Prb007 {

    private static final int PRIME_NUMBER_TIMES = 10001;

    public static void main(String[] args) {
        System.out.println(new Prb007().run(PRIME_NUMBER_TIMES));
    }

    public int run(int primeNumberPosition) {
        int x = 1;
        int countFindPrime = 0;

        while(countFindPrime < primeNumberPosition) {
            int countIsPrime = 0;

            for(int i = 1; i <= x; i ++) {

                if(x % i == 0)
                    countIsPrime++;

                if(countIsPrime > 2)
                    break;
            }

            if(countIsPrime == 2) {
                countFindPrime++;

                //System.out.println(x + " - ");
            }

            x++;
        }

        return x;
    }
}
