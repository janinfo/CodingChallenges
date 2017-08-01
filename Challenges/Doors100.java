import java.util.*;

public class Doors100 {
    public static void main (String[] args) {

        /*
         * _the challenge_
         *
         * https://rosettacode.org/wiki/100_doors
         */


        // create 100 'doors'
        List<Boolean> doorList = new ArrayList<Boolean>(Arrays.asList(new Boolean[101]));
//        doorList.remove(0);

        // set all doors on 'closed'
        Collections.fill(doorList, Boolean.FALSE);
        // FALSE = closed
        // TRUE = opened

        for (int i = 1; i <= 100; i++) {
            for (int n = i; n <= 100; n = n + i) {
                doorList.set((n-1), !doorList.get(n-1));
            }
        }

        for (int i = 1; i <= 100; i++) {
            if (doorList.get(i) == true) {
                System.out.println("Door " + i + " is open");
            }
            else {
                System.out.println("");
            }


        }
    }

}
