//Write a Java program to display the multiplication table of a given integer.

import java.util.Scanner; // Import the Scanner class for taking input

public class MultiplicationTable {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); // Read the integer input

        // Print the multiplication table header
        System.out.println("Multiplication table of " + num + ":");

        // Loop to calculate and print the multiplication table
        for (int i = 1; i <= 10; i++) {
            int result = num * i; // Calculate the result of num multiplied by i
            System.out.println(num + " * " + i + " = " + result); // Print the result
        }

        // Close the scanner to release resources
        scanner.close();
    }
}

/* Dry Run

Loop to Print Multiplication Table:

Line 15: for (int i = 1; i <= 10; i++) {
A for loop is initiated, starting with i = 1 and running until i <= 10.
First Iteration (i = 1):

Line 16: int result = num * i;
result is calculated as 7 * 1 = 7.
Line 17: System.out.println(num + " * " + i + " = " + result);
Output: 7 * 1 = 7.
Second Iteration (i = 2):

Line 16: int result = num * i;
result is calculated as 7 * 2 = 14.
Line 17: System.out.println(num + " * " + i + " = " + result);
Output: 7 * 2 = 14.
Third Iteration (i = 3):

Line 16: int result = num * i;
result is calculated as 7 * 3 = 21.
Line 17: System.out.println(num + " * " + i + " = " + result);
Output: 7 * 3 = 21.
Fourth Iteration (i = 4):

Line 16: int result = num * i;
result is calculated as 7 * 4 = 28.
Line 17: System.out.println(num + " * " + i + " = " + result);
Output: 7 * 4 = 28.
*/
