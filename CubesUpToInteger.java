import java.util.Scanner;

public class CubesUpToInteger {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        
        System.out.println("Cube of numbers up to " + n + ":");
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println(i + "^3 = " + cube);
       }

       
        scanner.close();
    }
}
