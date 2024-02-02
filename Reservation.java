import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Reservation Application!");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter the number of people with you: ");
        int numberOfPeople = scanner.nextInt();
        System.out.print("Enter the price: ");
        long price=scanner.nextLong();

        System.out.println("Destinations:");
        System.out.println("1. Vanarasi");
        System.out.println("2. Prayagraj");
        System.out.println("3. delhi");
        System.out.println("4. jammu");
        System.out.println("1. Goa");
        System.out.println("2. Pathankot");
        
        System.out.print("Select your destination (1-6): ");
        int destinationChoice = scanner.nextInt();

        makeReservation(name, address, mobileNumber, numberOfPeople, destinationChoice,price);

        scanner.close();
    }

    private static void makeReservation(String name, String address, String mobileNumber, int numberOfPeople, int destinationChoice, long price) {
        String destination;
        long totalCost;
    
        switch (destinationChoice) {
            case 1:
                destination = "Vanarasi";
                totalCost = numberOfPeople * price;
                break;
            case 2:
                destination = "prayagraj";
                totalCost = numberOfPeople * price;
                break;
            case 3:
                destination = "delhi";
                totalCost = numberOfPeople * price;
                break;
            case 4:
                destination = "Jammu";
                totalCost = numberOfPeople * price;
                break;
            case 5:
                destination = "Goa";
                totalCost = numberOfPeople * price;
                break;
            case 6:
                destination = "pathankot";
                totalCost = numberOfPeople * price;
                break;
            default:
                System.out.println("Invalid destination choice. Exiting reservation.");
                return;
        }
    
        System.out.println("\nReservation Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Number of People: " + numberOfPeople);
        System.out.println("Destination: " + destination);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Reservation made successfully!");
    }
}