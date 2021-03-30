package br.com.ricardosn.solutions;

/*
 * Project Euler - problem 002
 * */
public final class Prb002 {

    public static void main(String[] args) {
        System.out.println(new Prb002().run());
    }

    public int run() {
        int t = 0, fibonacci = 1, evenSum = 0;

        while(fibonacci <= 4000000) {

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
