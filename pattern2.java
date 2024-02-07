import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
