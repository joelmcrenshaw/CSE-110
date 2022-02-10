// AUTHOR: Joel Crenshaw
// FILENAME: Lab2.java
// SPECIFICATION: A program that takes the first amnd last name from the user and prints their full name out and the length of their name.
// FOR: CSE 110 - Lab #2
// TIME SPENT: 60-70 Minutes
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        // Declaring Variables
        String firstName = "";
        String lastName = "";
        String fullName = "";
        int nameLength = 0;
        Scanner scan = new Scanner(System.in);

        // Input first name
        System.out.println("Please enter your first name: ");
        firstName = scan.nextLine();
        System.out.println("Your first name is " +firstName);
        // Input last name
        System.out.println("Please enter your last name: ");
        lastName = scan.nextLine();
        System.out.println("Your first name is " +lastName);

        // Full name concatenation
        fullName = firstName + " " + lastName;
        // Converting full name to upper case
        fullName = fullName.toUpperCase();
        // Printing the length of the string
        int length = fullName.length();
        // Printing the values
        System.out.println(fullName);
        System.out.println(fullName.length());

        // STRING COMPARISON
        String title1 = new String("cse205");
        String title2 = "cse205";

        if (title1 == title2) {
            System.out.println("String comparison using '=' sign works");
        } else {
            System.out.println("String comparison using '==' does NOT work");
        }
        if (title1.equals(title2)) {
            System.out.println("String comparison using 'equals' method works");
        } else {
            System.out.println("String comparison using 'equals' method does NOT work");



        }


    }
}
