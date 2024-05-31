//Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

import java.util.Scanner; // Import the Scanner class for taking input

public class WeekdayName {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 7
        System.out.print("Enter a number between 1 and 7: ");
        int number = scanner.nextInt(); // Read the integer input

        // Check if the input number is within the valid range
        if (number < 1 || number > 7) {
            // If the input is not within the valid range, print an error message
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            // If the input is within the valid range, determine the corresponding weekday
            String weekday; // Declare a variable to store the weekday name
            switch (number) {
                case 1:
                    weekday = "Monday"; // If the input is 1, set weekday to Monday
                    break;
                case 2:
                    weekday = "Tuesday"; // If the input is 2, set weekday to Tuesday
                    break;
                case 3:
                    weekday = "Wednesday"; // If the input is 3, set weekday to Wednesday
                    break;
                case 4:
                    weekday = "Thursday"; // If the input is 4, set weekday to Thursday
                    break;
                case 5:
                    weekday = "Friday"; // If the input is 5, set weekday to Friday
                    break;
                case 6:
                    weekday = "Saturday"; // If the input is 6, set weekday to Saturday
                    break;
                case 7:
                    weekday = "Sunday"; // If the input is 7, set weekday to Sunday
                    break;
                default:
                    weekday = "Invalid day"; // If the input is not within 1-7, set weekday to Invalid day
            }

            // Print the weekday corresponding to the input number
            System.out.println("The weekday corresponding to the number " + number + " is: " + weekday);
        }

        // Close the scanner to release resources
        scanner.close();
    }
}

/* Dry Run

Reading Input:
The user inputs 3.
number is assigned the value 3.
Check Input Range:

3 is within the valid range (1 to 7), so the program proceeds to the next step.
Determine Weekday:

The switch statement evaluates number, which is 3.
Since number is 3, the case 3 is matched, and weekday is set to "Wednesday".*/
