package course2_day1;

public class OverflowUnderflow {
    public static void main(String[] args) {
        // What is an integer overflow and underflow?
        // integer overflow
        int number = 2147483647; // -2147483648 to 2147483647.
        int number2 = number + 2;
        System.out.println("integer overflow " + number2);
        // integer underflow
        int number3 = -2147483648; // -2147483648 to 2147483647.
        int number4 = number3 - 2;
        System.out.println("integer underflow " + number4);
    }
}
