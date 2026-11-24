//this is my best attempt at putting all of this in an array because I can't get this repo to appear in my command prompt thing at home. I can get it on vs code and that is what I am using to save and push and pull

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Conference 
{
    private int numNewGuests;
    private int details[];


    public Conference(int itIsNumNewGuests, int itIsDetails[])
    {
        numNewGuests = itIsNumNewGuests;
    }

    public int getNumNewGuests()
    {
        return numnNewGuests;
    }

    public int[] getDetails()
    {
        return details[];
    }

    public void Conference()
    {

    }

















  public static void main(String[] args) 
  {
        File myObj1 = new File("names.csv");
        int numAttendees = 90;
        String[] attendees = attendees[numAttendees];

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(myObj1)) 
        {
            while (myReader.hasNextLine()) 
            {     
                for(int i = 1, i < 91, i++)
                {
                    String data = myReader.nextLine();
                    System.out.println(data);
                    attendees[i] = data;
                }   
            } 
        }
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for(int j = 0, j < 91, j++)
        {
            System.out.print(attendees[j]);
        }
    }
}

