//Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner; // Import the Scanner class for taking input

public class PositiveNegative {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble(); // Read the double input

        // Check if the number is positive, negative, or zero and print the appropriate message
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner to release resources
        scanner.close();
    }
}

/* Dry Run

Let's take example inputs: 5.5, -3.2, and 0.

Reading Number Input:
Line 9: double number = scanner.nextDouble();
The user inputs a number, e.g., 5.5.
number is assigned the value 5.5.
Check and Print if Number is Positive, Negative, or Zero:

If number is 5.5:
Line 12: if (number > 0) {
The condition number > 0 is true since 5.5 > 0.
Line 13: System.out.println("The number " + number + " is positive.");
Output: The number 5.5 is positive.
If number is -3.2:

Line 14: else if (number < 0) {
The condition number < 0 is true since -3.2 < 0.
Line 15: System.out.println("The number " + number + " is negative.");
Output: The number -3.2 is negative.
If number is 0:

Line 16: else {
The condition number == 0 is implicitly checked since it falls through the previous conditions.
Line 17: System.out.println("The number is zero.");
Output: The number is zero.*/
