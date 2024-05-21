import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

       
        int sum = 0;
        int count = 0;
        int num = 1;
        while (count < n) {
            sum += num;
            num += 2; 
            count++;
        }

       
        System.out.println("The sum of the first " + n + " odd natural numbers is: " + sum);


        scanner.close();
    }
}
