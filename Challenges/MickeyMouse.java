public class MickeyMouse{
	public static void main(String[] args) {

		/*
		 * _the challenge_
		 *
		 * You print the numbers from 1 to n (here is n == 100).
		 * If a number is divisible
		 * 	- by 3 print "Mickey"
		 *	- by 5 print "Mouse"
		 *	- by 15 print "MickeyMouse"
		 * instead of the number
		 *
		 */
		
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.println("MickeyMouse");
			}
			else if (i % 3 == 0) {
				System.out.println("Mickey");
			}
			else if (i % 5 ==0){
				System.out.println("Mouse");
			}
			else {
				System.out.println(i);
			}
			
		}
	}

}
