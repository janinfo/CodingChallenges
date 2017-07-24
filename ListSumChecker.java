import java.util.*;

public class ListSumChecker {
	public static void main(String[] args) {
		
		// hashset
		Set<Integer> myNumList = new HashSet<Integer>(); // hashSet for actual numbers
		Set<Integer> inversList = new HashSet<Integer>(); // hashSet for invers numbers
		int myInt;
		
		System.out.println("Enter your result to calculate from two Sums of the hashSet: ");
		Scanner scanResult = new Scanner(System.in);		
		int result = scanResult.nextInt();
		
		System.out.println("Enter a valid integer to add to the hashSet");
		Scanner scanList = new Scanner(System.in);
		int nextListInt;
		do {
		scanList = new Scanner(System.in);
		nextListInt = scanList.nextInt();
		myNumList.add(nextListInt);
		} while (scanList.hasNextInt());
		
		
		// the numbers for hashSet; will be sorted for unknown reason
//		myNumList.add(6);
//		myNumList.add(3);
//		myNumList.add(5);
//		myNumList.add(1);
//		myNumList.add(7);
//		myNumList.add(11);
//		myNumList.add(4);
		
		
		System.out.println("The list to check:");
		System.out.println(myNumList + "\n");

		Iterator myIterator = myNumList.iterator();
		while (myIterator.hasNext()) {
			myInt = (Integer) myIterator.next();
			if (inversList.contains(myInt)) {
				System.out.println("Two numbers of the hashSet add up to the reuslt " + result + "\n" + 
				"Your two numbers are: " + myInt + " and " + (result - myInt) + ".");
				return;
			} else {
				inversList.add(result - myInt);	
			}
					
		}
		System.out.println("None of these numbers add up to " + result +".");
		
		
		
	}

}
