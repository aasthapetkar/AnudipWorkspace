//Write a Java program to display the cube of the given number up to an integer.

import java.util.Scanner; // Import the Scanner class for taking input

public class CubesUpToInteger {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt(); // Read the integer input

        // Print a header for the cube results
        System.out.println("Cube of numbers up to " + n + ":");

        // Loop from 1 to n (inclusive) to calculate and print the cubes
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i; // Calculate the cube of the current number i
            System.out.println(i + "^3 = " + cube); // Print the result in the format "i^3 = cube"
        }

        // Close the scanner to release resources
        scanner.close();
    }
}

/*Dry Run

Loop to Calculate and Print Cubes:

Line 15: 
for (int i = 1; i <= n; i++) {
The loop starts with i = 1 and runs until i = 5.
First Iteration (i = 1):

Line 16: 
int cube = i * i * i;
cube is calculated as 1 * 1 * 1 = 1.
Line 17: 
System.out.println(i + "^3 = " + cube);
Output: 1^3 = 1
Second Iteration (i = 2):

Line 16: 
cube = 2 * 2 * 2 = 8.
Line 17: 
System.out.println(i + "^3 = " + cube);
Output: 2^3 = 8
Third Iteration (i = 3):

Line 16: 
cube = 3 * 3 * 3 = 27.
Line 17: 
System.out.println(i + "^3 = " + cube);
Output: 3^3 = 27
Fourth Iteration (i = 4):

Line 16: 
cube = 4 * 4 * 4 = 64.
Line 17: 
System.out.println(i + "^3 = " + cube);
Output: 4^3 = 64
Fifth Iteration (i = 5):

Line 16: 
cube = 5 * 5 * 5 = 125.
Line 17: 
System.out.println(i + "^3 = " + cube);
Output: 5^3 = 125*/
