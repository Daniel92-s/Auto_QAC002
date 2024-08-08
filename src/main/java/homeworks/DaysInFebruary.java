package homeworks;
import java.util.Scanner;

public class DaysInFebruary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year between 1900 and 2016:");
        int year = scanner.nextInt();

        if (year < 1900 || year > 2016) {
            System.out.println("Year must be between 1900 and 2016.");
            return;
        }

        if (isLeapYear(year)) {
            System.out.println("February " + year + " has 29 days.");
        } else {
            System.out.println("February " + year + " has 28 days.");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}