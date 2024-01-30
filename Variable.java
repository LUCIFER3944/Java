import java.util.*;
public class Variable {
  public static void main(String[] args) {
    int n; 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Number");
    n=sc.nextInt();  
    if(n< 100){  
      System.out.println("Variable is less than 100");
    }
    else if(n==100)  
    {
      System.out.println("Variable is equal to 100");
    }
    else if (n>100)  
    {
      System.out.println("Variable is greater than 100");
    }
    else{
        System.out.println("Error");
    }
  }
}