//Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.Scanner; // Import the Scanner class for taking input

public class GreatestNumber {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble(); // Read the first number

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble(); // Read the second number

        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble(); // Read the third number

        // Initialize the greatest number to the first number
        double greatestNumber = num1;

        // Compare the second number with the current greatest number
        if (num2 > greatestNumber) {
            greatestNumber = num2; // Update the greatest number if the second number is greater
        }

        // Compare the third number with the current greatest number
        if (num3 > greatestNumber) {
            greatestNumber = num3; // Update the greatest number if the third number is greater
        }

        // Print the greatest number
        System.out.println("The greatest number is: " + greatestNumber);

        // Close the scanner to release resources
        scanner.close();
    }

}

/* Dry Run

Let's take example num1 = 45.6, num2 = 78.3, and num3 = 22.1.

Reading First Number:
Line 8: System.out.print("Enter the first number: ");
Line 9: double num1 = scanner.nextDouble();
num1 is assigned the value 45.6.

Reading Second Number:
Line 12: System.out.print("Enter the second number: ");
Line 13: double num2 = scanner.nextDouble();
num2 is assigned the value 78.3.

Reading Third Number:
Line 16: System.out.print("Enter the third number: ");
Line 17: double num3 = scanner.nextDouble();
num3 is assigned the value 22.1.

Initialize Greatest Number:
Line 20: double greatestNumber = num1;
greatestNumber is initialized to 45.6.
Compare Second Number:

Line 23: if (num2 > greatestNumber) {
The condition num2 > greatestNumber (78.3 > 45.6) is true.
Line 24: greatestNumber = num2;
greatestNumber is updated to 78.3.
Compare Third Number:

Line 27: if (num3 > greatestNumber) {
The condition num3 > greatestNumber (22.1 > 78.3) is false.
The program does not enter this if block.

*/
