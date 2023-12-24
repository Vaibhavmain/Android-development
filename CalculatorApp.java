import java.util.Scanner;

class Calculator {
    // Methods for each arithmetic operation
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Error: Cannot divide by zero.");
        }
    }
}

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            try {
                // Get input numbers
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                // Get the operation
                System.out.print("Choose an operation (+, -, *, /): ");
                char operation = scanner.next().charAt(0);

                // Perform calculation based on the operation
                double result = 0;
                switch (operation) {
                    case '+':
                        result = calculator.add(num1, num2);
                        break;
                    case '-':
                        result = calculator.subtract(num1, num2);
                        break;
                    case '*':
                        result = calculator.multiply(num1, num2);
                        break;
                    case '/':
                        result = calculator.divide(num1, num2);
                        break;
                    default:
                        System.out.println("Error: Invalid operation.");
                        continue; // Skip the rest of the loop and start a new iteration
                }

                // Display the result
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                // Consume the newline character in the input buffer
                scanner.nextLine();
            }

            // Ask if the user wants to perform another calculation
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("yes")) {
                // Exit the loop if the user does not want to continue
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}


