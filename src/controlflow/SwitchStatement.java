package controlflow;

public class SwitchStatement {

    public static void main(String[] args) {
        int day = 5;

        // switch expression
        String readableDay = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };

        System.out.println(readableDay);
    }

}
