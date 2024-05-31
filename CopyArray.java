public class CopyArray {
    public static void main(String[] args) {
        // Define and initialize the original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Create a new array to hold the copied elements
        int[] copiedArray = new int[originalArray.length];

        // Iterate through the original array and copy each element to the new array
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Print the original and copied arrays to verify the copy
        System.out.print("Original array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        
        System.out.print("\nCopied array: ");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
    }
}


/* Dry Run

Initialization: originalArray = {1, 2, 3, 4, 5}, copiedArray = {0, 0, 0, 0, 0}
First iteration: i = 0, originalArray[0] = 1, copiedArray[0] = 1
Second iteration: i = 1, originalArray[1] = 2, copiedArray[1] = 2
Third iteration: i = 2, originalArray[2] = 3, copiedArray[2] = 3
Fourth iteration: i = 3, originalArray[3] = 4, copiedArray[3] = 4
Fifth iteration: i = 4, originalArray[4] = 5, copiedArray[4] = 5
*/