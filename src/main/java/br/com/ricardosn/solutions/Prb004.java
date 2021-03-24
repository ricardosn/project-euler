package br.com.ricardosn.solutions;

public class Prb004 {

    public int run() {
        int largestPalindrome = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int prod = i * j;

                if(isPalindrome(prod) && prod > largestPalindrome) {
                    largestPalindrome = prod;
                }
            }
        }

        return largestPalindrome;
    }

    public String reverseString(String number) {
        return new StringBuilder(number).reverse().toString();
    }

    public boolean isPalindrome(int number) {
        String numberStr = String.valueOf(number);
        String reverseString = reverseString(String.valueOf(number));

        return numberStr.equals(reverseString);
    }
}
