import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-8
 *
 */
public class GenerateHash {

	/**
	 * This program will generate hash function for files 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------------------");
		System.out.println("Select an action");
		System.out.println("------------------");
		System.out.println("1. Generate hash");
		System.out.println("2. Compare hash");
		System.out.println("3. Re-compute");
		 
		System.out.println("------------------");
		System.out.println("Please enter your selection : ");
		System.out.println("------------------");
		
		userInput = scan.nextInt();
		if(userInput == 1)
		{
		  System.out.println("Generate hash");
		}
		else if (userInput == 2)
		{
			System.out.println("Compare hash");
		}
		else if (userInput == 3)
		{
			System.out.println("Re-compute");
		}
		else 
			System.out.println("wronge selection");
	}

}
