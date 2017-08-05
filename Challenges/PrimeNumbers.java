import java.util.TreeSet;

public class PrimeNumbers {
    public static void main (String[] args) {

        /*
         * _the challenge_
         *
         * Give out a list of  all prime numbers from 3 to n.
         * (note: 2 is still not in the list (need to fix this))
         */

        // hashSet to store all the prime numbers
        TreeSet<Integer> myPrimeNumbers = new TreeSet<Integer>();

        // the maximum number you want to verify
        int max = 10000;

        for (int num = 0; num <= max; num++) {
            for (int j = 2; j <= num; j++) {
                if (num % j == 0) {
//                    System.out.println(num + " is not a prime number.");
                    break;
                }
                if (num - j == 1) {
                    System.out.println("PRIME NUMBER FOUND! It's: " + num + ".");
                    myPrimeNumbers.add(num);
                }
            }

        }
        System.out.println("\n");
        System.out.println("The complete List of prime numbers from 3 to " + max + " is:");
        System.out.println(myPrimeNumbers);
//        System.out.println("The biggest prime number below " + max + " is " + myPrimeNumbers.last() + ".");

    }
}
