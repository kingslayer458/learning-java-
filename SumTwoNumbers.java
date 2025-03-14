import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Get second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Output result
        System.out.println("The sum is: " + sum);

        // Close scanner
        scanner.close();
    }
}
