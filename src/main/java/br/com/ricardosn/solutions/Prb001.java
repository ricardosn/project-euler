package br.com.ricardosn.solutions;

/*
* Project Euler - problem 001
* */
public final class Prb001 {

    public static void main(String[] args) {
        System.out.println(new Prb001().run());
    }

    public int run() {
        int result = 0;

        for (int i = 0; i < 1000; i++) {
            result += (i % 3 == 0 || i % 5 == 0) ? i : 0;
        }

        return result;
    }

}
