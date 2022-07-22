package methods;

public class Scoping {

    public static void main(String[] args) {
        int x = 42;
        System.out.println("x in main: " + x);
        printNumber();
        System.out.println("x in main: " + x);
    }

    static void printNumber() {
        int x = 4711;
        System.out.println("x in printNumber: " + x);
    }

}
