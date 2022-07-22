package controlflow;

public class IfElseStatement {

    public static void main(String[] args) {

        int waterTemperature = 0;

        String aggregateState;
        if (waterTemperature <= 0) {
            aggregateState = "frozen";
        } else if (waterTemperature >= 100) {
            aggregateState = "boiling";
        } else {
            aggregateState = "liquid";
        }

        System.out.println(aggregateState);

    }

}
