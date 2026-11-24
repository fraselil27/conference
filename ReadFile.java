import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile 
{
  public static void main(String[] args) 
  {
        File myObj1 = new File("companies.csv");
        int numCompanies = 16;
        String[] companies = companies[16];

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(myObj1)) 
        {
            while (myReader.hasNextLine()) 
            {     
                for(int i = 1, i < 17, i++)
                {
                    String data = myReader.nextLine();
                    System.out.println(data);
                    companies[i] = data;
                }   
            } 

        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        File myObj2 = new File("names.csv");

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(myObj2)) 
        {
            while (myReader.hasNextLine()) 
            {     
            String data = myReader.nextLine();
            System.out.println(data);
            }
        } 

        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
  }
}

/*
try(Scanner myReader = new Scanner(myOnj))
{
    while(myReader.hasNextLine())
    {
        String data = myReader.nextLine();
        String[] arrAttend = data.split(","); //split only on commas inside the string
        this will give an array of strings
        int coID = Integer.parseInt(arrAttend[coID])
        system.out.println(data)
        }
        }
        catch(FileNotFoundException e)
        {
        System.out.porintln(error occurred)}
    }
    e.printStackTrace();
}
*/