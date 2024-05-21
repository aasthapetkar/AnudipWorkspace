import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        
        if (month < 1 || month > 12) {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        } else {
            
            int daysInMonth;
            switch (month) {
                case 2:
                    daysInMonth = 28; 
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                default:
                    daysInMonth = 31;
            }

            
            System.out.println("Number of days in month " + month + ": " + daysInMonth);
        }

        
        scanner.close();
    }
}
