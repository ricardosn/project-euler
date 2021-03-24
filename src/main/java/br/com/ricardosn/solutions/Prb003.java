package br.com.ricardosn.solutions;

public class Prb003 {

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
