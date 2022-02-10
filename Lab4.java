
// Import Scanner class
import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        // Declare all appropriate variables 
    	int userChoice, userNumber, result;
        
    	Scanner scan = new Scanner(System.in);

        do {
            // Display the menu
            displayMenu();
            

            // Asks the user for one option
            userChoice = scan.nextInt();

            switch(userChoice) 
            
            {
            // Calculates and displays the sum of integers between 1 and the number the user inputs
            case 1 :
            	System.out.println("Enter a number: ");
            	userNumber = scan.nextInt();
            	// Initializes the result to 0
            	result = 0;
            	// Loops from the number inputted by the user down to 1 and adds itself to determine the sum of all integers
            	for (int i = userNumber; i > 0; i-- ) {
            		result += i;
            	}
            	System.out.printf("The sum of 1 to %d is %d\n\n", userNumber, result);                                 
            
            	break;
            
            // Calculates the factorial of the user inputted number
            case 2 : 
            	System.out.println("Enter a number: ");
            	userNumber = scan.nextInt();
            	// Initializes the result to 1 so that zero is not multiplied into the calculation
            	result = 1;
            	// Loops from the user inputted number down to 1 and multiplies to itself to find the factorial
            	for (int i = userNumber; i > 0; i--) {
				result *= i;
            
            	
           		System.out.printf("The factorial of %d is %d\n\n", userNumber, result);           		      	
           	}
            
            	break;
            
            // Finds the leftmost integer of the user inputted number
            case 3 :
            	System.out.println("Enter a number: ");
            	userNumber = scan.nextInt();
            	// Stores user number into result so that the original userNumber is not changed during the calculation
            	result = userNumber;
            	// Divides the integer by 10 until it is in the range of 1-9
            	// The result is the leftmost digit
            	while (result > 9){
            		result /=10;
            	}
            	System.out.printf("The leftmost digit of %d is %d\n\n", userNumber, result);
            
            	break;
            
            case 4 : 
            	System.out.println("Bye");
            	break;
            		
         	}	
            
        // Ends the do while loop          
        
        } while (userChoice != 4);        
        
      
    } // End of main()  

    
     // Prints the menu
    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
    } // End displayMenu()
    
 } // End Lab4 class

