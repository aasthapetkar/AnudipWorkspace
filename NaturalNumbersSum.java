//Write a Java program to display n terms of natural numbers and their sum.

import java.util.Scanner; // Import the Scanner class for taking input

public class NaturalNumbersSum {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt(); // Read the integer input

        // Initialize the sum variable to 0
        int sum = 0;
        
        // Print the first n natural numbers
        System.out.print("The first " + n + " natural numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " "); // Print the current number
            sum += i; // Add the current number to the sum
        }

        // Print the sum of the first n natural numbers
        System.out.println("\nThe sum of the first " + n + " natural numbers is: " + sum);

        // Close the scanner to release resources
        scanner.close();
    }
}

/* Dry Run

Reading Value of n:

Line 9: int n = scanner.nextInt();
The user inputs 5.
n is assigned the value 5.
Initialize Sum Variable:

Line 12: int sum = 0;
The sum variable is initialized to 0.
Print First n Natural Numbers and Calculate Sum:

Line 14: System.out.print("The first " + n + " natural numbers are: ");

Output: The first 5 natural numbers are:
Loop from 1 to n (i = 1 to 5):

First Iteration (i = 1):

Line 16: System.out.print(i + " ");
Output: 1
Line 17: sum += i;
sum is updated to 0 + 1 = 1.
Second Iteration (i = 2):

Line 16: System.out.print(i + " ");
Output: 2
Line 17: sum += i;
sum is updated to 1 + 2 = 3.
Third Iteration (i = 3):

Line 16: System.out.print(i + " ");
Output: 3
Line 17: sum += i;
sum is updated to 3 + 3 = 6.
Fourth Iteration (i = 4):

Line 16: System.out.print(i + " ");
Output: 4
Line 17: sum += i;
sum is updated to 6 + 4 = 10.
Fifth Iteration (i = 5):

Line 16: System.out.print(i + " ");
Output: 5
Line 17: sum += i;
sum is updated to 10 + 5 = 15*/

