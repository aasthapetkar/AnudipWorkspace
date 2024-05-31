//WAP to check whether the number is palindrome or not.

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();  // Read the integer input from the user

        int originalNum = num;  // Store the original number for comparison later

        int reversedNum = 0;  // Variable to store the reversed number
        while (num != 0) {  // Loop to reverse the digits of the number
            int remainder = num % 10;  // Get the last digit of the number
            reversedNum = reversedNum * 10 + remainder;  // Add the last digit to the reversed number
            num /= 10;  // Remove the last digit from the number
        }

        if (originalNum == reversedNum) {  // Check if the original number is equal to the reversed number
            System.out.println(originalNum + " is a palindrome.");  // Print if it's a palindrome
        } else {
            System.out.println(originalNum + " is not a palindrome.");  // Print if it's not a palindrome
        }

        scanner.close();  // Close the scanner to free resources
    }
}


/*Dry Run Example:

1.User Input:
Integer: 121

2.Execution Steps:
The program starts and prompts the user to enter an integer.
User enters 121, which is stored in num and originalNum.
Initialize reversedNum to 0.
Enter the while loop with num = 121:
First iteration:
remainder = 121 % 10 = 1
reversedNum = 0 * 10 + 1 = 1
num = 121 / 10 = 12
Second iteration:
remainder = 12 % 10 = 2
reversedNum = 1 * 10 + 2 = 12
num = 12 / 10 = 1
Third iteration:
remainder = 1 % 10 = 1
reversedNum = 12 * 10 + 1 = 121
num = 1 / 10 = 0
Exit the while loop as num is now 0.
Compare originalNum (121) with reversedNum (121):
Since they are equal, print "121 is a palindrome."
Close the scanner.*/
