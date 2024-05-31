//Write a Java program to calculate the average value of array elements.

public class AverageArray {
    public static void main(String[] args) {
        // Define and initialize the array
        int[] numbers = {1, 2, 3, 4, 5};

        // Variable to store the sum of array elements
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Print the result
        System.out.println("The average of the array is: " + average);
    }
}


/* Dry Run

Initialization: sum = 0
First iteration: i = 0, numbers[0] = 1, sum = 0 + 1 = 1
Second iteration: i = 1, numbers[1] = 2, sum = 1 + 2 = 3
Third iteration: i = 2, numbers[2] = 3, sum = 3 + 3 = 6
Fourth iteration: i = 3, numbers[3] = 4, sum = 6 + 4 = 10
Fifth iteration: i = 4, numbers[4] = 5, sum = 10 + 5 = 15

Calculate Average:
average = (double) sum / numbers.length
average = (double) 15 / 5 = 3.0
*/
