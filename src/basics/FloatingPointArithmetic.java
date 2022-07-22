package basics;

public class FloatingPointArithmetic {

    public static void main(String[] args) {
        // Java uses IEEE 754 floating point representation

        System.out.println(5 / 2);

        System.out.println(5.0 / 2.0);

        // Results becomes floating point data type
        System.out.println(5.0 / 2);

        System.out.println(2.5 + 0.5);

        // unexpected effects
        System.out.println(10.0f - 0.1f - 0.1f);
        System.out.println(10000.0f + 0.0001f);

    }

}
