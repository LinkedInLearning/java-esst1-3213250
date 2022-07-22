package methods;

import java.util.Arrays;

public class PrimeNumberFinder {

    public static void main(String[] args) {
        int[] primeNumbers = findPrimeNumbers(10, 20);
        System.out.println(Arrays.toString(primeNumbers));
    }

    static int[] findPrimeNumbers(int start, int end) {
        int[] primeNumbers = new int[end - start + 1];
        int foundPrimeNumbers = 0;

        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                primeNumbers[foundPrimeNumbers] = i;
                foundPrimeNumbers++;
            }
        }

        int[] primeNumberResult = new int[foundPrimeNumbers];
        for (int i = 0; i < primeNumberResult.length; i++) {
            primeNumberResult[i] = primeNumbers[i];
        }

        return primeNumberResult;

    }

    static boolean isPrimeNumber(int x) {
        if (x <= 1) {
            return false;
        }

        for (int i = 2; i < (x / 2); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;

    }

}
