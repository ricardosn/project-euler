package br.com.ricardosn.project.euler.solutions;

public class Prb001 {
    
    public int run() {
        int result = 0;

        for (int i=0; i<1000; i++) {
            result += (i%3 == 0 || i%5 == 0) ? i : 0;
        }

        return result;
    }

}