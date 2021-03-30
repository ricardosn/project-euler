package br.com.ricardosn.solutions;

/*
 * Project Euler - problem 003
 * */
public final class Prb003 {

    public static void main(String[] args) {
        System.out.println(new Prb003().run());
    }

    public long run() {

        long largestPrime = 0L;

        for(long i = 1; i <= 13195L; i++) {

            int count = 0;

            for(int j = 1; j <= i; j++) {

                if(i%j == 0) {
                    count++;
                }

                if (count > 2) {
                    break;
                }
            }

            if(count <= 2) {
                System.out.print(i + " - ");
                largestPrime = i;
            }
        }

        return largestPrime;
    }

}
