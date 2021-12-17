package day2;

public class StringReview {
    public static void main(String[] args) {
        System.out.println("hello");

        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println(helloString);

        // String methods

        String str1 = "Hello Cydeo 1";
        String str2 = "Hello Cydeo 2";

        // length()
        int len = str1.length();
        System.out.println(len);

        // charAt(integer), it returns the desired index of the string
        System.out.println(str1.charAt(str1.length() - 1));

        // adding the strings
        System.out.println(str1 + " " + str2);

        // if I want to convert an integer to a string
        int number1 = 100;
        String str3 = "" + number1;
        System.out.println(str3);

        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        // str1.substring(beginIncluded, endsNOTincluded);
        // putting just an integer value is not a very good practice during the coding challenges
        String str4 = str1.substring(0, 5);
        System.out.println(str4);

    }
}
//    Suppose a string s contains the first name and last name separated by a space.
//    Write a code that seperates the first name and last name.
//            Example: Enter first name and last name: Py Charm
//    Py
//            Charm
//    Tip: string.indexOf(' ’) >> returns the index of white space
//            =========================================
//            *Loops*
//            =========================================
//            ---while loop---
//            =========================================
//    A while loop executes statements repeatedly while the condition is true.
//            while (loop-continuation-condition) {
//        // Loop body
//        Statement(s);
//    }
//=========================================
//    int count = 0;
//while (count < 100) {
//        System.out.printIn(“Welcome to Java!“);
//        count++; }
//=========================================
//    int sum = 0, i = 1;
//while (i < 10) {
//        sum = sum + i;
//    }
//=========================================
//    Loops Logic
//    Scanner input = new Scanner(System.in);
//    int number, max;
//    number = input.nextInt();
//    max = number;
//while (number != 0) {
//        number = input.nextInt();
//        if (number > max)
//            max = number;
//    }
//System.out.println(“max is ” + max);
//System.out.println(“number ” + number);
//=========================================
//    Writing fibonacci numbers
//=========================================
///*
//    Write a function which prints out the numbers from 1 to 30 but
//    for numbers which are a multiple of 3, print “FIN” instead of the number
//    and for numbers which are a multiple of 5, print “RA” instead of the number.
//    for numbers which are a multiple of both 3 and 5, print “FINRA” instead of the number.
//     */
//        =========================================
//    Palindrome >> classic interview question
//=========================================
//    Prime Numbers
//=========================================
//    For-each loop >> after the arrays
//}
