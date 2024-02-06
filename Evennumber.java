import java.util.Scanner;

public class Evennumber{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the user input
        int number = scanner.nextInt();

        // Check if the number is odd or even
        if (isOdd(number)) {
            System.out.println(number + " is an odd number.");
        } else {
            System.out.println(number + " is an even number.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Method to check if a number is odd
    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
