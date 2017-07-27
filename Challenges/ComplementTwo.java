import java.util.*;

public class ComplementTwo {
    public static void main(String[] args) {

        /* _the challenge_
		 *
		 * Given is a list of numbers.
		 * The algorithm iterates over the list.
         * At each entry it checks if two entry dextral there is the complement.
		 */


        LinkedList myList = new LinkedList();
        // create a second LinkedList
        LinkedList myComplementList;

        myList.add(5);
        myList.add(9);
        myList.add(3);
        myList.add(-5);
        myList.add(-3);
        myList.add(-1);
        myList.add(7);
        myList.add(1);

        // clone myList
        myComplementList = (LinkedList) myList.clone();

        // remove the first two entries
        myComplementList.removeFirst();
        myComplementList.removeFirst();

        // need this so the Iterator isn't confused
        // doesn't change the math
        myComplementList.add(0);
        myComplementList.add(0);

        System.out.println("MyList: " + myList);
        System.out.println("MyComplementList to compare: " + myComplementList + "\n");

        // iterate through myNumList
        Iterator myIterator = myList.iterator();
        Iterator myComplementIterator = myComplementList.iterator();

        int int1; // index of myIterator
        int int2; // index of myComplementIterator
        int result; // |int1 - int2|

        while (myIterator.hasNext()) {
            int1 = (Integer) myIterator.next();
            int2 = (Integer) myComplementIterator.next();

            result = Math.abs(int1) - Math.abs(int2);
            if (result == 0) {
                System.out.println("Complement found: |" + int1 + "-(" + int2 + ")| = 0.");
            } else {
                System.out.println("No Complement for " + int1 + ".");
            }

        }

    }
}
