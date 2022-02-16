/*-------------------------------------------------------------
// CSE 110: Online
// Assignment: Assignment 5 
// Author: Joel M. Crenshaw / 1216811336
// Description: Ten Methods 
//-----------------------------------------------------------*/

public class Assignment05 {
	
	// 1. Method that prints "Hello, and welcome!"
	static void displayGreeting() {
		System.out.println("Hello, and welcome!");
	}
	
	// 2. Prints the value of the argument that was passed into it
	static void displayText(String arg) {
		System.out.println(arg);
	}
	
	// 3. Method should print the sum of three arguments passed to it 
	static void printTotal(int x, int y, int z) {
		System.out.println(x + y + z);	
		
	}
	
	// 4. Method that takes three int arguments and returns the sum of the three arguments 
	static int getTotal(int x, int y, int z) {
		return x + y + z;
		
	}
	
	// 5. Method that takes three int arguments and returns the average of the three args passed 
	// as a double 
	static double getAverage(double t, double u, double v) {
		return ((double)t +((double)u + (double) v)) / 3;
	}
	
	// 6. Method that calculates the average string length 
	static double averageLength(String x, String y, String z) {
		return (x.length() + y.length() + z.length()) / 3.0;
	}
	
	// 7. Method that takes two String arguments and returns the length of the shortest string passed into it  
	static int lengthOfShortest(String a, String b){
	        if (a.length() > b.length())
	            return b.length();
	        else if (a.length() < b.length())
	            return a.length();
	        else
	            return a.length();
	    }
	
	// 8. Method that returns a string of asterisks that is the same length as the argument passsed into it
	static String stringOfStars(String x){
        String result = "";
        for (int i = 0; i < x.length(); i++)
            result += "*";
        return result;
    }
	
	// 9. Method that takes two String arguments. 
	// Returns a String of asterisks, 
	// that is the same length as the longest String argument passed into it
	static String maxStringOfStars(String a, String b){
        String result = "";
        if (a.length() > b.length()){
            for (int i = 0; i < a.length(); i++)
                result += "*";
        }
        else {
            for (int i = 0; i < b.length(); i++)
                result += "*";
        }
        return result;
    }
	
	// 10. Define a static method named midStringOfStars,
    //   that takes three String arguments.
    //   When this function is called, it should return a String of asterisks (*)
    //   that is the same length as the string argument with the length
    //   that would be in the middle if the lengths of the arguments were arranged in ascending order.
	static String midStringOfStars(String a, String b, String c) {
		String result = "";
		// Verifies if a is the middle integer
		if ((a.length() > b.length() && a.length() < c.length()) || (a.length() > c.length() && a.length() < b.length())){
            for (int i = 0; i < a.length(); i++)
                result += "*";
        }
		// b is the middle integer
		else if ((b.length() > a.length() && b.length() < c.length()) || (b.length() > c.length() && b.length() < a.length())) {
			for (int i = 0; i < b.length(); i++)
                result += "*";
		}
		
		// c is the middle integer
        else {
            for (int i = 0; i < c.length(); i++)
                result += "*";
        }
        return result;
	}
	

	public static void main(String[] args) {
		
		// Method 1
		displayGreeting();
		// Method 2 
		displayText("Mass " + "Effect");
		// Method 3
		printTotal(2, 1, 2);
		// Method 4
		System.out.println(getTotal(7, 8, 9));
		// Method 5
		System.out.println(getAverage(20, 24, 25));
		// Method 6
		System.out.println(averageLength("Hercules", "Captian America", "Bruce Banner"));
		// Method 7
		System.out.println(lengthOfShortest("Thanos", "Batman Begins"));
		// Method 8
		System.out.println(stringOfStars("Infinity War"));
		// Method 9
		System.out.println(maxStringOfStars("The Dark Knight Rises", "Bane"));
		// Method 10
		System.out.println(midStringOfStars("1234", "12", "12345"));
		
	} // end of main

} // end of class
