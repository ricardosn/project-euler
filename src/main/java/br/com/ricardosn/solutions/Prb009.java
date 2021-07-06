package br.com.ricardosn.solutions;

public final class Prb009 {

    private static final int MAX_SUM = 1000;

    public static void main(String[] args) {
        System.out.println(new Prb009().run());
    }

    public int run() {

        for(int a = 1; a <= MAX_SUM; a++) {

            for(int b = 2; b <= MAX_SUM; b++) {

                for(int c = 3; c <= MAX_SUM; c++) {

                    double t_10 = Math.pow(a, 2) + Math.pow(b, 2);
                    double t_11 = Math.pow(c, 2);

                    int t_2 = a + b + c;

                    if(t_10 == t_11 && t_2 == MAX_SUM) {
                        return a * b * c;
                    }
                }
            }
        }

        return -1;
    }
}
