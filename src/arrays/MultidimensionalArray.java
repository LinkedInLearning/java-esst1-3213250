package arrays;

public class MultidimensionalArray {

    public static void main(String[] args) {

        // 3 x 3 Matrix
        int[][] twoDimensionalArray = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println(twoDimensionalArray[2][2]);

        int[][] pascalTriangle = {
                {1},
                {1, 1},
                {1, 2, 1}
        };

        System.out.println(pascalTriangle[2][1]);
    }

}
