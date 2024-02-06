import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 20; i++) {
            int square = i * i;
            System.out.println("Square of " + i + " is: " + square);
        }
    }
}
