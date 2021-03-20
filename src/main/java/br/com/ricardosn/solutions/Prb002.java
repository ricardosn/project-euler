package br.com.ricardosn.solutions;

public class Prb002 {

    public int run() {
        int t = 0, fibonacci = 1, evenSum = 0;

        while(fibonacci <= 4000000) {

            //System.out.print(fibonacci + " + ");

            if(fibonacci % 2 == 0) {
                evenSum += fibonacci;
            }

            int sum = t + fibonacci;

            t = fibonacci;
            fibonacci = sum;
        }

        return evenSum;
    }

}
