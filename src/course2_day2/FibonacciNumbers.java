package course2_day2;

public class FibonacciNumbers {
    public static void main(String[] args) {
        // Fibonacci Numbers: you are adding the previous value to the next number sum1 sum2 sum
        // 1 1 2 3 5 8 13 21 34 etc...
        // first 50 fibonaccci numbers

        // first number in the number set
//        int sum1 = 1;
//
//        // second number in the number set
//        int sum2 = 1;
//
//        // third number in the number set
//        int sum = 0;
//        for (int i = 0; i < 7; i++) {
//            sum = sum1 + sum2;//sum=2
//            sum1 = sum2;//sum1 = 1
//            sum2 = sum;// sum2 = 2
//            System.out.print(sum + " ");
//
//        }
//
//        System.out.println("\n"+ sum);

        int num1 = 1;
        int num2 = 1;
        int sum = 0;

        System.out.print(num1 + " " + num2);

        for (int i = 0; i < 10; i++) {
            sum = num1 + num2; //sum = 2 3 5
            System.out.print(" " + sum + " ");
            num1 = num2; // num1 = 1 2
            num2 = sum; // num2 = 2 3
        }
    }
}