
import java.util.InputMismatchException;
import java.util.Scanner;




public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the numerator: ");
                int numerator = scanner.nextInt();

                System.out.print("Enter the denominator: ");
                int denominator = scanner.nextInt();

                int result = divide(numerator, denominator);
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero. Please enter a non-zero denominator.");

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter whole numbers only.");
                scanner.nextLine();
            }
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
