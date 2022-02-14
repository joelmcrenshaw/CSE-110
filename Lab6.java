/*-------------------------------------------------------------
	// AUTHOR: JOEL M CRENSHAW
	// FILENAME: LAB6.JAVA
	// SPECIFICATION: A PROGRAM USED TO KEEP TRACK OF ALL STUDENT GRADES IN DIFFERENT GROUPS.
	// FOR: CSE 110- Lab #6
	// TIME SPENT: 50 MINUTES
	//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab6 {
	public static void main(String[] args) {
		
		// Declaring and instantiating the Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Asking the user to input the amount of students
		System.out.println("How many students do you have? ");
		int numStudents = scanner.nextInt();
		
		// Declaring the studentGroups and studentGrades arrays
		int[] studentGroups = null; // arrays are objects
		double[] studentGrades = null;
		
		
		// Instantiating the necessary arrays
		studentGroups = new int[numStudents];
		studentGrades = new double[numStudents];
		
		// Loop that takes the input from the user and determines the size of the array
		for (int i = 0; i < numStudents; i++) {
			System.out.println("[Group #] and [Grade] for Entry " + i);
			studentGroups[i] = scanner.nextInt();
			studentGrades[i] = scanner.nextDouble();
		}
		
		// Header
		System.out.println("\n==== List of Student Records ====");
		
		// Loop
		for (int i = numStudents - 1; i >= 0; i--) {
			System.out.printf("Group %d - %.2f Points\n", studentGroups[i], studentGrades[i]);		
		}
		
		
		
	} // End of main

} // End of class
