//Write a java programs to perform basic calculators operations(Input from user using switch case)

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input

        System.out.println("Welcome to the Basic Calculator!");  // Welcome message

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();  // Read the first number from the user

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();  // Read the second number from the user

        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");  // List of operations
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();  // Read the user's choice of operation

        double result = 0;  // Variable to store the result of the operation
        boolean validOperation = true;  // Flag to check if the operation is valid

        switch (choice) {
            case 1:
                result = num1 + num2;  // Perform addition
                break;
            case 2:
                result = num1 - num2;  // Perform subtraction
                break;
            case 3:
                result = num1 * num2;  // Perform multiplication
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;  // Perform division if denominator is not zero
                } else {
                    System.out.println("Error: Division by zero is not allowed.");  // Error message for division by zero
                    validOperation = false;  // Set flag to false indicating invalid operation
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");  // Error message for invalid choice
                validOperation = false;  // Set flag to false indicating invalid operation
        }

        if (validOperation) {
            System.out.println("The result is: " + result);  // Display the result if the operation was valid
        }
    }
}


//Dry Run Example:

//1.User Input:
//First number: 5
//Second number: 3
//Operation: 1 (Addition)

//2.Execution Steps:
//The program starts and displays the welcome message.
//Prompts the user to enter the first number (5) and reads the input.
//Prompts the user to enter the second number (3) and reads the input.
//Displays the list of operations and prompts the user to enter their choice (1).
//The switch statement evaluates the user's choice:
//Case 1 matches, so it performs addition: result = 5 + 3, thus result is 8.
//validOperation remains true because the choice was valid.
//The if (validOperation) block is executed, and the program prints "The result is: 8".
