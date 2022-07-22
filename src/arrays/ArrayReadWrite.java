package arrays;

import java.util.Arrays;

public class ArrayReadWrite {

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};

        // read access
        int firstElement = myArray[0];
        System.out.println(firstElement);

        int secondElement = myArray[1];
        System.out.println(secondElement);

        int lastElement = myArray[myArray.length - 1];
        System.out.println(lastElement);

        // write access
        myArray[1] = 99;

        System.out.println(myArray[1]);
        System.out.println(myArray);

        // print an array in human-readable form
        System.out.println(Arrays.toString(myArray));
    }

}
