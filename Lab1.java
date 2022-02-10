import java.util.Scanner;
  /*------------------------------------------------------------ 
// AUTHOR: JOEL CRENSHAW
// FILENAME: LAB1
// SPECIFICATION: A PROGRAM USED TO CALCULATE A USERS GRADE AVERAGE 
// FOR: CSE 110- Lab #1 
// TIME SPENT: 45-50 MINUTES */
public class Lab1 {
        public static void main(String[] args) {
            // Declaring and initializing grade variables
            int testGrade1;
            int testGrade2;
            int testGrade3;
            // Declaring and initializing final constant 
            final double NUM_TESTS = 3;
            // Declaring scanner variable and instantiating (creating) new scanner object  
            Scanner in = new Scanner(System.in);
            // Gathering input from the user, reading in the integers
            System.out.print("Enter the grade of the first test----> ");
                testGrade1 = in.nextInt();
            System.out.print("Enter the grade of the second test----> ");
                testGrade2 = in.nextInt();
            System.out.print("Enter the grade of the third test----> ");
                testGrade3 = in.nextInt();
            // Declaring average 
            double average;
            // Calculating the average of the three tests
            average = (testGrade1 + testGrade2 + testGrade3) / (double) NUM_TESTS;
            // Printing the average to the console
            System.out.printf("Your average test score: " + "%.2f", average);
        }           
    }
    

        
