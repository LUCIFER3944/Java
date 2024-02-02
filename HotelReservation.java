import java.util.Scanner;

public class HotelReservation {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter your customer name:");
        String Cname = sc.nextLine();
        
        System.out.println("Enter your customer Address:");
        String address = sc.nextLine();
        
        System.out.println("Enter your Mobile number:");
        long mobileNumber = sc.nextLong();


        System.out.println("Choose a room: \n 1. delux,\n 2. normal,\n 3. classic,\n 4. smallroom, \n 5. Bigroom");
        int room = sc.nextInt();

        System.out.println("Price");
        int price = sc.nextInt();
 

        System.out.println("Enter quantity of people:");
        int quantity = sc.nextInt();

        System.out.println("Enter number of days:");
        int numberofdays= sc.nextInt();
        double totalPrice = 0;
       
        switch (room) {
            case 1:
                System.out.println("You chose delux.");
                totalPrice = numberofdays*quantity * price;
                break;
            case 2:
                System.out.println("You chose normal.");
                totalPrice = numberofdays*quantity * price;
                break;
            case 3:
                System.out.println("You chose classic.");
                totalPrice = numberofdays*quantity * price;
                break;
            case 4:
                System.out.println("You chose smallroom.");
                totalPrice = numberofdays*quantity * price;
                break;
            case 5:
                System.out.println("You chose bigroom");
                totalPrice = numberofdays*quantity * price;
                break;
            default:
                System.out.println("Invalid choice. Please select a valid pizza.");
                return;
        }

        System.out.println("Costumer name="+Cname);
        System.out.println("Address="+address);
        System.out.println("Costumer mobile number="+mobileNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("price " + price);
        System.out.println("Total Price: $" + totalPrice);
}    
}
