//Write a Java program that prompts the user to enter a positive integer and calculates its factorial using a while loop. 
//The program should display the factorial as the output.

import java.util.Scanner; // Import the Scanner class for taking input

public class FactorialCalculator {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt(); // Read the integer input

        // Check if the entered number is a positive integer
        if (num < 0) {
            // If the number is negative, print an error message
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize the variable to hold the factorial result
            int factorial = 1;

            // Initialize the loop variable
            int i = num;

            // Loop to calculate the factorial
            while (i > 0) {
                factorial *= i; // Multiply the current factorial value by i
                i--; // Decrement the loop variable
            }

            // Print the calculated factorial
            System.out.println("The factorial of " + num + " is " + factorial + ".");
        }

        // Close the scanner to release resources
        scanner.close();
    }
}


/* Dry Run
 
Calculate Factorial:

Line 16: else {
The program enters the else block.

Line 18: int factorial = 1;

A variable factorial is initialized to 1.
Line 21: int i = num;

A variable i is initialized to 5.
While Loop:

Line 24: while (i > 0) {

The while loop starts with i = 5 and runs until i > 0.
First Iteration (i = 5):

Line 25: factorial *= i;
factorial is updated to 1 * 5 = 5.
Line 26: i--;
i is decremented to 4.
Second Iteration (i = 4):

Line 25: factorial *= i;
factorial is updated to 5 * 4 = 20.
Line 26: i--;
i is decremented to 3.
Third Iteration (i = 3):

Line 25: factorial *= i;
factorial is updated to 20 * 3 = 60.
Line 26: i--;
i is decremented to 2.
Fourth Iteration (i = 2):

Line 25: factorial *= i;
factorial is updated to 60 * 2 = 120.
Line 26: i--;
i is decremented to 1.
Fifth Iteration (i = 1):

Line 25: factorial *= i;
factorial is updated to 120 * 1 = 120.
Line 26: i--;
i is decremented to 0.
 */
 
