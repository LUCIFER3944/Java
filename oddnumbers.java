import java.util.Scanner;
public class oddnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        for (int i = 1; i <= 29; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}