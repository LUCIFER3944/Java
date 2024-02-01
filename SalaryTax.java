import java.util.Scanner;

public class SalaryTax {
    public static void main(String args[]) {
        int salary, tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        salary = sc.nextInt();

        if (salary <= 40000)
            tax = 0;
        else if (salary > 40000 && salary <= 700000)
            tax = (salary - 40000) * 10 / 100;
        else if (salary > 700000 && salary <= 1000000)
            tax = 30000 + (salary - 700000) * 20 / 100;
        else
            tax = 90000 + (salary - 1000000) * 30 / 100;

        System.out.println("Tax: " + tax);
    }
}