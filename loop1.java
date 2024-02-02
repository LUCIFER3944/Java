import java.util.Scanner;
public class loop1 {
	public static void main(String[] args) 
	{		
	int counter;
	Scanner inputDevice = new Scanner(System.in);
	System.out.print("Please enter loop counter value >> ");
	counter = inputDevice.nextInt();
	System.out.println("Before Loop");
	while (counter < 5)
	{
	System.out.println("Inside Loop- Counter= "+ counter);
	counter++;		
	}		
	System.out.println("After While Loop");	
  }
}