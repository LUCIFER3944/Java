import java.util.Scanner;
public class EvenandOdd {
    public static  void main(String[] args) {
Scanner sc=new Scanner(System.in);
int num;
System.out.println("Enter a number:");
num =sc.nextInt();
for (int i = 1; i <= 100; i++) {
    if (i % 2 == 0) {
        System.out.println(i +"is even");
    }
    else{
        System.out.print(i +" is odd ");
    }
}
}


}
