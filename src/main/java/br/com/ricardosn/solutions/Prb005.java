package br.com.ricardosn.solutions;

/*
 * Project Euler - problem 005
 * */
public final class Prb005 {

    public static void main(String[] args) {
        System.out.println(new Prb005().run());
    }

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
