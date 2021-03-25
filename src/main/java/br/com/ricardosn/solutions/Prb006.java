package br.com.ricardosn.solutions;

public class Prb006 {

    public int run() {
        int sumOfSquares = 0;
        int squareOfSums = 0;

        for(int i = 1; i <= 100; i++) {
            sumOfSquares += Math.pow(i, 2);
        }

        for(int j = 1; j <= 100; j++) {
            squareOfSums += j;
        }

        squareOfSums = (int) Math.pow(squareOfSums, 2);

        return squareOfSums - sumOfSquares;
    }
}
