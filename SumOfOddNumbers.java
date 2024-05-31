//Write a Java program that displays the sum of n odd natural numbers.

import java.util.Scanner; // Import the Scanner class for taking input

public class SumOfOddNumbers {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt(); // Read the integer input

        // Initialize variables for sum, count, and the first odd number
        int sum = 0;
        int count = 0;
        int num = 1;

        // Loop to calculate the sum of the first n odd numbers
        while (count < n) {
            sum += num; // Add the current odd number to the sum
            num += 2;   // Move to the next odd number (adding 2 to the current odd number)
            count++;    // Increment the count of odd numbers added
        }

        // Print the sum of the first n odd numbers
        System.out.println("The sum of the first " + n + " odd natural numbers is: " + sum);

        // Close the scanner to release resources
        scanner.close();
    }
}

