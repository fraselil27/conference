//Lily Fraser
//APCSA
//NewAttendees.java
//same as other one, can't try to run this on this computer but can work in vs code and that is what I am doing.
import java.util.Scanner;

public class NewAttendees
{
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        String makeChanges = "no";
        System.out.println("Would you like to add attendees to the guest list? Type 'yes' if so and 'no' if not.");
        makeChanges = scan.nextLine();

        if(makeChanges.equals("yes"))
        {
            int numGuests = 0;
            System.out.println("How many new guests would you like to add?");
            numGuests = scan.nextInt();
			String buffer = scan.nextLine();
            int newAttendees[] = new int[numGuests];

             String newInfo = "none";
            for(int i = 1, i < numGuests + 1, i++)
            {
                System.out.println("What info would you like to add about guest "+ i +"?");
                newInfo = scan.nextLine();
                newAttendees[i-1] = newInfo;
            }
        }
        else
        {
            System.out.print("Ok, no worries. Your current guests will have a place to sit soon.");
        }

    }
}