import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year to check if it's a leap year:");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(" a leap year.");
        } else {
            System.out.println(" not a leap year.");
        }
    }
}
