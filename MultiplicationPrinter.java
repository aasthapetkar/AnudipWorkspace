//Write a Java program that prompts the user to enter a number and then prints the multiplication table of that number using a for loop. 
//The table should display multiplication from 1 to 10.

import java.util.Scanner; // Import the Scanner class for taking input

public class MultiplicationPrinter {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Read the integer input

        // Print the multiplication table header
        System.out.println("Multiplication table of " + num + ":");

        // Loop to calculate and print the multiplication table
        for (int i = 1; i <= 10; i++) {
            int result = num * i; // Calculate the result of num multiplied by i
            System.out.println(num + " x " + i + " = " + result); // Print the result
        }

        // Close the scanner to release resources
        scanner.close();
    }
}


/* Dry Run

Reading Number Input:

Line 9: int num = scanner.nextInt();
The user inputs 5.
num is assigned the value 5.
Print Multiplication Table Header:

Line 12: System.out.println("Multiplication table of " + num + ":");
Output: Multiplication table of 5:
Loop to Print Multiplication Table:

Line 15: for (int i = 1; i <= 10; i++) {

A for loop is initiated, starting with i = 1 and running until i <= 10.
First Iteration (i = 1):

Line 16: int result = num * i;
result is calculated as 5 * 1 = 5.
Line 17: System.out.println(num + " x " + i + " = " + result);
Output: 5 x 1 = 5.
Second Iteration (i = 2):

Line 16: int result = num * i;
result is calculated as 5 * 2 = 10.
Line 17: System.out.println(num + " x " + i + " = " + result);
Output: 5 x 2 = 10.
Third Iteration (i = 3):

Line 16: int result = num * i;
result is calculated as 5 * 3 = 15.
Line 17: System.out.println(num + " x " + i + " = " + result);
Output: 5 x 3 = 15.
Fourth Iteration (i = 4):

Line 16: int result = num * i;
result is calculated as 5 * 4 = 20.
Line 17: System.out.println(num + " x " + i + " = " + result);
Output: 5 x 4 = 20.*/
