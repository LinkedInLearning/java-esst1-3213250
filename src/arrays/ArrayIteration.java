package arrays;

public class ArrayIteration {

    public static void main(String[] args) {
        String[] heroes = {
                "Spiderman",
                "Iron Man",
                "Thor",
                "Black Panther"
        };

        // classical for-statement
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }

        // extended for-statement / foreach-loop
        for (String h : heroes) {
            System.out.println(h);
        }
    }

}
