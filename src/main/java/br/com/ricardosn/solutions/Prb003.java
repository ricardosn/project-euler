package br.com.ricardosn.solutions;

/*
 * Project Euler - problem 003
 * */
public final class Prb003 {

    public static void main(String[] args) {
        System.out.println(new Prb003().run());
    }

    /*
    * O conceito matemático utilizado foi o de decomposição em fatores primos por divisões sucessivas
    * O teorema diz que um número inteiro n pode ser decomposto pela multiplicação de m números primos, sendo que
    * pm > 1:
    * n = p0 * p1 * p2 * ... * pm
    */
    public long run() {
        long n = 600851475143L;

        while(true) {
            long p = smallestPrimeFactor(n);
            if (p < n)
                n /= p;
            else
                return n;
        }
    }

    private static long smallestPrimeFactor(long n) {
        if(n <= 1)
            throw new IllegalArgumentException();

        // Não é necessário testar [2, n], pois a raiz quadrada é o resultado da multiplicação de todos os fatores primos
        int end= (int) Math.sqrt(n);

        for(int i = 2; i <= end; i++) {
            if(n % i == 0)
                return i;
        }
        return n;
    }

}
