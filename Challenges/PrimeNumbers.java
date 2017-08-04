import java.util.HashSet;
import java.util.Set;

public class PrimeNumbers {
    public static void main (String[] args) {

        /*
         * _the challenge_
         *
         * Give out a list of  all prime numbers from 3 to 100.*
         */
        System.out.println("Hello Prime");
        // hashSet to store all the prime numbers
        Set<Integer> myPrimeNumbers = new HashSet<Integer>();

        int max = 10;

        for (int num = 3; num <= max; num++) {
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
//                    System.out.println(num + " is not a prime number");
                    break;
                }
                if (num - j == 1) {
                    System.out.println(num + " is a prime");
                }
            }
        }


    }
}
