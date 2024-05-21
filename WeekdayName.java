import java.util.Scanner;
public class WeekdayName {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();

        
        if (number < 1 || number > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
         
            String weekday;
            switch (number) {
                case 1:
                    weekday = "Monday";
                    break;
                case 2:
                    weekday = "Tuesday";
                    break;
                case 3:
                    weekday = "Wednesday";
                    break;
                case 4:
                    weekday = "Thursday";
                    break;
                case 5:
                    weekday = "Friday";
                    break;
                case 6:
                    weekday = "Saturday";
                    break;
                case 7:
                    weekday = "Sunday";
                    break;
                default:
                    weekday = "Invalid day";
            }

            
            System.out.println("The weekday corresponding to the number " + number + " is: " + weekday);
        }

        
        scanner.close();
	}

}
