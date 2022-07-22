package basics;

public class Casting {

    public static void main(String[] args) {
        // Widening Type Cast
        double wideningCast = 5;
        System.out.println(wideningCast);

        // Narrowing Type Cast
        int simpleCast = (int) 5.5;
        System.out.println(simpleCast);

        int castingResult = (int) (5.0 / 2.5);
        System.out.println(castingResult);

        double castingOrder = 5.0 / (int) 2.5;
        System.out.println(castingOrder);
    }

}
