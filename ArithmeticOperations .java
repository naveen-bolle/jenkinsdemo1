import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient;

        if (num2 != 0) {
            quotient = num1 / num2;
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + product);

        scanner.close();
    }
}

