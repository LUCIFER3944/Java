import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number that you want in your square:");
        n = sc.nextInt();

        for ( n = 0; n< 20; n++) {
            int squared = n * n;
            System.out.println(squared);
        }
    }
}
