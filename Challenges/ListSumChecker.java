import java.util.*;

public class ListSumChecker {
	public static void main(String[] args) {
		
		// hashSet for actual numbers
		Set<Integer> myNumList = new HashSet<Integer>();
		// hashSet for invers numbers
		Set<Integer> inversList = new HashSet<Integer>();
		
		int myInt;
		
		System.out.println("Enter your result to calculate from two Sums of the hashSet: ");		
		Scanner scanResult = new Scanner(System.in);		
		int result = scanResult.nextInt();
		
		System.out.println("Enter a valid Integer to add to the hashSet");
		System.out.println("(Hint: add '0' to stop scaning)");
		
		// scan as many integers as you want; end scanning with '0'
		int nextListInt;
		do {
		Scanner scanList = new Scanner(System.in);
		nextListInt = scanList.nextInt();
		myNumList.add(nextListInt);
		} while (nextListInt != 0);
		

		// '0' is end condition and not used in the hastSet
		myNumList.remove(0);
		
		System.out.println("The list to check:");
		System.out.println(myNumList + "\n");

		// iterate through myNumList
		Iterator myIterator = myNumList.iterator();
		// add the number to inversList if its not already included
		while (myIterator.hasNext()) {
			myInt = (Integer) myIterator.next();
			if (inversList.contains(myInt)) {
				System.out.println("Two numbers of the hashSet add up to the result " + result + "\n" + 
				"The two numbers are: " + (result - myInt) + " and " + myInt + ".");
				return;
			} else {
				inversList.add(result - myInt);	
			}
					
		}
		System.out.println("None of these numbers add up to " + result +".");
		
		
		
	}

}
