package basics;

public class IntegerArithmetic {

    public static void main(String[] args) {
        int addition = 42 + 5;
        System.out.println(addition);

        int subtraction = 42 - 5;
        System.out.println(subtraction);

        int negativeNumbers = 5 - 42;
        System.out.println(negativeNumbers);

        int multiplication = 42 * 5;
        System.out.println(multiplication);

        int division = 42 / 2;
        System.out.println(division);

        int unexpectedDivision = 5 / 2;
        System.out.println(unexpectedDivision);

        int operatorPrecedence = 5 + 2 * 10;
        System.out.println(operatorPrecedence);

        int parantheses = (5 + 2) * 10;
        System.out.println(parantheses);
    }

}
