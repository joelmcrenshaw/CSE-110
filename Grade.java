import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Declaring variables HW, midterm, and final grade
        double hwScore = 0;
        double midtermScore = 0;
        double gradeFinal = 0;
        
        int i = 0;
        
        while (i <= 2) {

            if (i == 0) {
                System.out.print("Enter your HOMEWORK grade: ");
                hwScore = scan.nextDouble();


                if (hwScore > 100) {
                    System.out.println("Error, the HOMEWORK grade is not a valid entry.");


                } else {
                    i++;

                }
            }

            if (i == 1) {
                System.out.print("Enter your MIDTERM EXAM grade: ");
                midtermScore = scan.nextDouble();


                if (midtermScore > 100) {
                    System.out.print("Error, the MIDTERM GRADE is not a valid entry.");

                } else {
                    i++;

                }

            }
            if (i == 2) {
                System.out.print("Enter your FINAL EXAM grade: ");
                gradeFinal = scan.nextDouble();

                if (gradeFinal > 200) {
                    System.out.println("Error, the FINAL EXAM grade is not a valid entry.");

                } else i++;

            }

        }
        // Formula for calculating the weighted total
        double weightedTotal = (gradeFinal / 200 * 50) + (midtermScore * 0.25) + (hwScore * 0.25);
        // Displays the weighted total and if student passed or failed the class
        System.out.println("Student's weighted total is " + weightedTotal);
        if (weightedTotal >= 50) {
            System.out.println("Student PASSED the class");
        } else {
            System.out.println("Student FAILED the class");

        }

        scan.close();
    } 
} 

