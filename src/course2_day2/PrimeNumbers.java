package course2_day2;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
        public static void main(String[] args) {
            // Find the prime numbers till 50
            // min prime number is 2

            // the first loop is to get any number
            for (int prime = 2; prime < 50; prime++) {
                // we want to make that isPrime is "true" by default
                // if we do not make it true here, and if gets "false" value in the second loop
                // it will stay as "false" during the rest of the iteration
                boolean isPrime = true;
                // and we wanna check the number from the first loop in here in the second loop by using "divisor"
                for (int divisor = 2; divisor < prime; divisor++) {
                    if (prime % divisor == 0) {
                        isPrime = false;
                        // is it is not a prime, I need to break the loop
                        break;
                    }
                }
                // we need to make sure that number is a prime number
                // before we print it out
                if (isPrime) {
                    System.out.print(prime + " ");
                }

            }
//            2nd solution:
//            public static List<Integer> getPrimes(int num){
//                ArrayList<Integer> list = new ArrayList<>();
//
//                for (int y = 1; y<=num; y++){
//                    int count = 0;
//                    for (int x = 1; x <= y; x++) {
//                        if (y % x == 0) {
//                            count++; // when count == 2 it means the number is prime because prime is only divisible by 1 and itself
//                        }
//                    }
//                    if (count==2) list.add(y);
//                }
//                return list;
//            }
        }
    }

