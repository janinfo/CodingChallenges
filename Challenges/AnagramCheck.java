import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
	
	public static void main(String[] args) {
		
		// scanner reads two strings to compare
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String word1 = scan.nextLine();
		System.out.println("Enter second String: ");
		String word2 = scan.nextLine();
		
		// checking if the two words have the same size
		if (word1.length() != word2.length()) {
			System.out.println("This ain't no anagram!");
		} else {
			
			// casting to charArray due to better comparison
			// converting to lowercase since 'R' is still equal to 'r'
			char[] word1char = word1.toLowerCase().toCharArray();
			char[] word2char = word2.toLowerCase().toCharArray();
			
			Arrays.sort(word1char);
			Arrays.sort(word2char);

			String word1new = new String(word1char);
			word1new = word1new.toLowerCase();
			
			String word2new = new String(word2char);
			word2new = word2new.toLowerCase();

			if (word1new.equals(word2new)) {
				System.out.println("Anagram found");
			} else {
				System.out.println("This is no anagram!");
			}
		}
	}
}
