import java.util.Scanner;

public class PalindromCheck {
	
	public static void main(String[] args) {
		
		// empty String to store the reversed word
		String word_rev = "";	
		
		// scans the word you want to verify
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word or phrase: ");
		System.out.println("(Without punctuation)");
		String word = scan.nextLine();
		
		// ignore all whitespaces and reverse it
		word = word.replaceAll("\\s+","");
		word_rev = new StringBuilder(word).reverse().toString();
		
		if (word.equals(word_rev)) {
			System.out.println("Palindrom found!");
		} else {
			System.out.println("This ain't no palindrom");
		}
	}
}
