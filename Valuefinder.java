import java.util.Scanner;

public class Valuefinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount for clothes: ");
        double clothesAmount = scanner.nextDouble();

        System.out.print("Enter amount for electronics: ");
        double electronicsAmount = scanner.nextDouble();

        System.out.print("Enter amount for food: ");
        double foodAmount = scanner.nextDouble();

        double taxRate = 0.33; // Assuming a 33% tax rate of total product.
        double totalAmount = clothesAmount + electronicsAmount + foodAmount;
        double totalTax = totalAmount * taxRate;
        double totalMoney = totalAmount + totalTax;

        System.out.println("Total amount after tax: $" + totalMoney);
    }
}