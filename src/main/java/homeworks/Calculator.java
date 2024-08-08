package homeworks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Prompt user for the operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Prompt user for second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Perform the calculation and display the result
        double result = 0;
        boolean validOperation = true;

        if (operation == '+') {
            result = firstNumber + secondNumber;
        } else if (operation == '-') {
            result = firstNumber - secondNumber;
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
        } else if (operation == '/') {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                validOperation = false;
            }
        } else {
            System.out.println("Error: Invalid operation.");
            validOperation = false;
        }

        // Display the result if the operation was valid
        if (validOperation) {
            System.out.println("The result is: " + result);
        }
    }
}

