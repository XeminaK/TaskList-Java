import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
//		System.out.println(getInt(scnr, "Pick an int."));
		getIntInRange(scnr, "Please enter a number", 1, 4);
	}
	
	
	//Validate user input to be in range between minimum and maximum number
	public static int getIntInRange(Scanner scnr, String prompt, int min, int max) {
		
		while (true) {
			System.out.println(prompt);
			
			try {
				int input = scnr.nextInt();
				if (input < min || input > max) {
					scnr.nextLine(); //clear input
					System.out.println("Try again.  Please enter a number that is shown on the list.");
				} else {
					return input;
				} //end if-else statement
				
			} catch (InputMismatchException e) {
				scnr.nextLine(); // clear input
				System.out.println("Try again. Please enter a valid number using digits.");
			}
			
		} //end while loop

	}
	
	//Validate the prompt for Y/N
	public static String getString(Scanner scnr, String prompt) {
		
		System.out.println(prompt);
		String ans = scnr.nextLine();
		
		while (true) {
			if (ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N")) {
				return ans;
			} else {
				scnr.nextLine();
				System.out.println("Please enter Y or N");
			}
		}//end while loop
	}
	
	//Loop method to validate integer to string
	public static int getInt(Scanner scnr, String prompt) {
		while (true) {
			System.out.println(prompt);
			try {
				int input = scnr.nextInt();
				return input;
			} catch (InputMismatchException e) {
				scnr.nextLine(); // clear input
				System.out.println("Try again. Please enter a valid number using digits.");
			}
		}
	}
	
	
	//Recursion method to validate integer to string
	public static int getIntR(Scanner scnr, String prompt) {
		
		System.out.println(prompt);
		try {
			return scnr.nextInt();
		} catch (InputMismatchException e) {
			scnr.nextLine(); // clear input
			System.out.println("Try again. Please enter a valid number using digits.");
			return getIntR(scnr, prompt);
		}
	}

}
