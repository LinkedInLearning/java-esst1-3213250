package controlflow;

public class WhileStatement {

    public static void main(String[] args) {
        /*
         * while (boolean exp) {
         *   statement(s)
         * }
         */

        int counter = 0;

        while (counter < 10) {
            System.out.println(counter);
            counter++;
        }
        System.out.println("loop is over");
        System.out.println(counter);
    }

}
