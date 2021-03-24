package br.com.ricardosn.solutions;

public class Prb004 {

    public long run() {
        long largestPalindrome = 0;


        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int prod = i * j;

                // is palindrome?
                if(isPalindrome(prod) && prod > largestPalindrome) {
                    largestPalindrome = prod;
                }
            }
        }

        return largestPalindrome;
    }

    public boolean isPalindrome(long number) {
        String numberString = String.valueOf(number);
        int numberStringLength = numberString.length();

        String numberStringFirstHalf = numberString.substring(0, numberStringLength / 2);
        String numberStringSecondHalf = numberString.substring(numberStringLength / 2, numberStringLength);

        StringBuilder sb = new StringBuilder();

        for(int i = numberStringSecondHalf.length() - 1; i >= 0; i--) {
            sb.append(numberStringSecondHalf.charAt(i));
        }

        String numberStringSecondHalfCompare = sb.toString();

        return numberStringFirstHalf.equals(numberStringSecondHalfCompare);
    }
}
