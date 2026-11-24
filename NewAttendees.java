//Lily Fraser
//APCSA
//NewAttendees.java
//same as other one, can't try to run this on this computer but can work in vs code and that is what I am doing.
import java.util.Scanner;

public class NewAttendees
{
    public int addAttendees(String makeChanges)
    {
        Scanner scan = new Scanner(System.in);
        String makeChanges = "no";
        System.out.println("Would you like to add attendees to the guest list? Type 'yes' if so and 'no' if not.");
        makeChanges = scan.nextLine();
        int numNewGuests = 0;
        String nemAttendees[];
        if(makeChanges.equals("yes"))
        {
            String buffer;
            System.out.println("How many new guests would you like to add?");
            numNewGuests = scan.nextInt();
			buffer = scan.nextLine();
        }
        else
        {
            System.out.print("Ok, no worries. Your current guests will have a place to sit soon.");
        }
        return numNewGuests;
    }
}