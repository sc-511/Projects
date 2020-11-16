import java.util.Random;
import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in);
		boolean mainMenu = true;
		int input;
		Random random = new Random();
		
		while (mainMenu) {
			
			System.out.println("Welcome To Fact Or Quote [METAL GEAR SOLID EDITION] ");
			System.out.println("======================================================");
			System.out.println("Choose one of the following :");
			System.out.println("(1) Fact ");
			System.out.println("(2) Quote");
			System.out.println("(3) Exit ");
			System.out.println("======================================================");
			input = userInput.nextInt();
		
		switch (input) {
		
		case 1:
			System.out.println("Please choose a number between 1 & 10 :");
			int factInput = userInput.nextInt();
			System.out.println("Random Fact Coming Your Way!.....");
			
			//Math.random()
			break;
			
		case 2: 
			System.out.println("Random Quote Coming Your Way!.....");
			break;
			
		case 3:	
			System.out.println("Exiting System...");
			System.out.println("==================");
			System.exit(0);
			break;
			
		default: 
			System.out.println("Please choose a 1 or 2!");
			System.out.println("==================");
			break;
		
		}
		
		
		}
	}

}
