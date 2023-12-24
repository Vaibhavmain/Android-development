import java.util.Scanner;

class Calculator {
    
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
                
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                
                System.out.print("Choose an operation (+, -, *, /): ");
                char operation = scanner.next().charAt(0);

                
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
                        continue; 
                }

                
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                
                scanner.nextLine();
            }

            
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("yes")) {
                
                break;
            }
        }

        
        scanner.close();
    }
}


