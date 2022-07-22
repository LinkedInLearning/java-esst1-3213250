package basics;

public class LocalVariableTypeInference {

    public static void main(String[] args) {
        // int myNumber
        var myNumber = 42;
        myNumber = 11;

        // forbidden, wrong type
        //myNumber = "11";

        // missing initializer
        //var something;
        //something = 4711;

        var myString = "java";
    }

}
