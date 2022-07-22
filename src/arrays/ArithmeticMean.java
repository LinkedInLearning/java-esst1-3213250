package arrays;

public class ArithmeticMean {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6, 1, 2, 5, 6};

        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        double mean = (double) sum / numbers.length;

        System.out.println(mean);
    }

}
