import java.util.Random;
import java.util.Scanner;

public class MagicDice {
    public static void main (String[] args) {

        /*
         * _the challenge_
         *
         * Design a 'six-sided dice' whereby the likelihood to
         * get a particular side rises with every toss.
         *
         * The default values of each sides are 1/6.
         * After the 5 appears, all other values rise at 2%.
         * The likelihood for 5 is set then to 1/6-(5*2)  ≈ 6.66%
         */

        double d1 = 0.16666666666; //dice = 1
        double d2 = 0.16666666666; //dice = 2
        double d3 = 0.16666666666; //dice = 3
        double d4 = 0.16666666666; //dice = 4
        double d5 = 0.16666666666; //dice = 5
        double d6 = 0.16666666666; //dice = 6

        // for debugging realsons
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int result5 = 0;
        int result6 = 0;



        System.out.println("Press 'w' to roll the dice *a lot of times* times");
        System.out.println("Any other character to stop this crazy machine");

        Scanner reader = new Scanner(System.in);
        char input = reader.next().charAt(0);

        while (input == 'w'){
            for (int i = 0; i < 1; i++) {

                double toss = Math.random();

                if (toss > d1 + d2 +d3 + d4 +d5) {
//                    System.out.println("1");
                    result1++;
                    d1 *= 0.9;
                    d2 *= 1.02;
                    d3 *= 1.02;
                    d4 *= 1.02;
                    d5 *= 1.02;
                    d6 *= 1.02;

                }
                else if (toss > d1 + d2 +d3 + d4) {
//                    System.out.println("2");
                    result2++;
                    d2 *= 0.9;
                    d1 *= 1.02;
                    d3 *= 1.02;
                    d4 *= 1.02;
                    d5 *= 1.02;
                    d6 *= 1.02;
                }
                else if (toss > d1 + d2 +d3) {
//                    System.out.println("3");
                    result3++;
                    d3 *= 0.9;
                    d1 *= 1.02;
                    d2 *= 1.02;
                    d4 *= 1.02;
                    d5 *= 1.02;
                    d6 *= 1.02;
                }
                else if (toss > d1 + d2) {
//                    System.out.println("4");
                    result4++;
                    d4 *= 0.9;
                    d1 *= 1.02;
                    d2 *= 1.02;
                    d3 *= 1.02;
                    d5 *= 1.02;
                    d6 *= 1.02;
                }
                else if (toss > d1) {
//                    System.out.println("5");
                    result5++;
                    d5 *= 0.9;
                    d1 *= 1.02;
                    d2 *= 1.02;
                    d3 *= 1.02;
                    d4 *= 1.02;
                    d6 *= 1.02;
                }
                else {
//                    System.out.println("6");
                    result6++;
                    d6 *= 0.9;
                    d1 *= 1.02;
                    d2 *= 1.02;
                    d3 *= 1.02;
                    d4 *= 1.02;
                    d5 *= 1.02;
                }
                System.out.println("calculating ..");

            }
            System.out.println("The 1 appeared " + result1 + " times");
            System.out.println("The 2 appeared " + result2 + " times");
            System.out.println("The 3 appeared " + result3 + " times");
            System.out.println("The 4 appeared " + result4 + " times");
            System.out.println("The 5 appeared " + result5 + " times");
            System.out.println("The 6 appeared " + result6 + " times");

            input = reader.next(".").charAt(0);
        }
    }
}
