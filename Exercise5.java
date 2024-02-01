//Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
import java.util.Scanner;
public class Exercise5 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("for week press 1 ");
        int day = in.nextInt();
        System.out.println("for next useless week press 2");
        int day2 =in.nextInt();
        System.out.print("for new week press 3 ");
        int day3 = in.nextInt();
        System.out.println("for next new useless week press 4");
        int day4 =in.nextInt();
        System.out.print("for week press 5 ");
        int day5 = in.nextInt();
        System.out.println("for next useless week press 6");
        int day6 =in.nextInt();
        System.out.print("for new week press 7 ");
        int day7 = in.nextInt();
        
   
        switch (day) {
            case 1:System.out.println( "Monday"); break;
            case 2:System.out.println( "Tuesday"); break;
            case 3:System.out.println( "Wednesday"); break;
            case 4:System.out.println( "Thursday") ;break;
            case 5:System.out.println( "Friday"); break;
            case 6:System.out.println( "Saturday"); break;
            case 7:System.out.println( "Sunday"); break;
            default:System.out.println( "Invalid day range");
        }
        switch (day2) {
            case 1:System.out.println( "Monday1"); break;
            case 2:System.out.println( "Tuesday1"); break;
            case 3:System.out.println( "Wednesday1"); break;
            case 4:System.out.println( "Thursday1") ;break;
            case 5:System.out.println( "Friday1"); break;
            case 6:System.out.println( "Saturday1"); break;
            case 7:System.out.println( "Sunday1"); break;
            default:System.out.println( "Invalid day range");
        }
        switch (day3) {
            case 1:System.out.println( "Monday1"); break;
            case 2:System.out.println( "Tuesday1"); break;
            case 3:System.out.println( "Wednesday1"); break;
            case 4:System.out.println( "Thursday1") ;break;
            case 5:System.out.println( "Friday1"); break;
            case 6:System.out.println( "Saturday1"); break;
            case 7:System.out.println( "Sunday1"); break;
            default:System.out.println( "Invalid day range");
        }
        switch (day4) {
            case 1:System.out.println( "Monday1"); break;
            case 2:System.out.println( "Tuesday1"); break;
            case 3:System.out.println( "Wednesday1"); break;
            case 4:System.out.println( "Thursday1") ;break;
            case 5:System.out.println( "Friday1"); break;
            case 6:System.out.println( "Saturday1"); break;
            case 7:System.out.println( "Sunday1"); break;
            default:System.out.println( "Invalid day range");
        }
        switch (day5) {
            case 1:System.out.println( "Monday1"); break;
            case 2:System.out.println( "Tuesday1"); break;
            case 3:System.out.println( "Wednesday1"); break;
            case 4:System.out.println( "Thursday1") ;break;
            case 5:System.out.println( "Friday1"); break;
            case 6:System.out.println( "Saturday1"); break;
            case 7:System.out.println( "Sunday1"); break;
            default:System.out.println( "Invalid day range");
        }
        switch (day6) {
            case 1:System.out.println( "Monday1"); break;
            case 2:System.out.println( "Tuesday1"); break;
            case 3:System.out.println( "Wednesday1"); break;
            case 4:System.out.println( "Thursday1") ;break;
            case 5:System.out.println( "Friday1"); break;
            case 6:System.out.println( "Saturday1"); break;
            case 7:System.out.println( "Sunday1"); break;
            default:System.out.println( "Invalid day range");
        }
        switch (day7) {
            case 1:System.out.println( "Monday1"); break;
            case 2:System.out.println( "Tuesday1"); break;
            case 3:System.out.println( "Wednesday1"); break;
            case 4:System.out.println( "Thursday1") ;break;
            case 5:System.out.println( "Friday1"); break;
            case 6:System.out.println( "Saturday1"); break;
            case 7:System.out.println( "Sunday1"); break;
            default:System.out.println( "Invalid day range");
        }

    }
}

