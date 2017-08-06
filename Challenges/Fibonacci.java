import java.math.BigInteger;

public class Fibonacci {
    public static void main (String[] args) {

        /*
         * _the challenge_
         *
         * write a basic Fibonacci algorithm
         * the first numbers are: 0 1 1 2 3 5 8 13..
         */

        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");


        for (int i = 1; i < 101; i++) {
            System.out.println("The " + i + ".Fibonacci number is: " + a);
            BigInteger c = new BigInteger("0");
            c = c.add(a).add(b);

            a = b;
            b = c;


        }
    }
}
