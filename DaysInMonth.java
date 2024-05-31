//Write a Java program to find the number of days in a month.

import java.util.Scanner; // Import the Scanner class for taking input

public class DaysInMonth {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a month number
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt(); // Read the month number input

        // Check if the entered month number is valid
        if (month < 1 || month > 12) {
            // If the month number is not valid, print an error message
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        } else {
            // Variable to store the number of days in the month
            int daysInMonth;

            // Determine the number of days in the given month using a switch statement
            switch (month) {
                case 2: // February
                    daysInMonth = 28; 
                    break;
                case 4: // April
                case 6: // June
                case 9: // September
                case 11: // November
                    daysInMonth = 30;
                    break;
                default: // All other months
                    daysInMonth = 31;
            }

            // Print the number of days in the specified month
            System.out.println("Number of days in month " + month + ": " + daysInMonth);
        }

        // Close the scanner to release resources
        scanner.close();
    }
}

/*Dry Run
  
Check Validity of Month Number:
Line 12: if (month < 1 || month > 12) {
The condition month < 1 || month > 12 is evaluated.
Since 4 is between 1 and 12, the condition is false.
The program does not enter the if block and proceeds to the else block.
Determine Number of Days in the Month:

Line 18: else {
The program enters the else block.
Line 20: int daysInMonth;
A variable daysInMonth is declared to store the number of days in the month.
Switch Statement:

Line 23: switch (month) {
The switch statement evaluates the value of month.
Case for April:

Line 26:case 4:
The case for 4 (April) matches.

Line 27: daysInMonth = 30;
daysInMonth is assigned the value 30.

Line 28: break;
The break statement exits the switch block.
Print Number of Days:

Line 32:System.out.println("Number of days in month " + month + ": " + daysInMonth);
Output: Number of days in month 4: 30*/
