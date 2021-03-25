package br.com.ricardosn.solutions;

public class Prb005 {

    public int run() {
        boolean evenlyDivisible = false;
        int smallestNumber = 0;

        do {
            int count = 0;
            smallestNumber++;

            for(int i = 1; i <= 20; i++) {

                if(smallestNumber % i == 0)
                    count++;
                else
                    break;
            }

            if(count == 20)
                evenlyDivisible = true;

        } while (!evenlyDivisible);

        return smallestNumber;
    }
}
