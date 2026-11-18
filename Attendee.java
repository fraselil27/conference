//Lily Fraser
//APCSA
//Attendee.java

public class Attendee
{
    private String name;
    private int table;
    private int seatNum;
    private int company;

    public Attendee(String inItName, int companyID)
    {
        name = inItName;
        company = companyID;
    }

    public String getName()
    {
        return name;
    }

    public int getTable()
    {
        return table;
    }

    public int getSeatNum()
    {
        return seatNum;
    }

    public int getCompany()
    {
        return company;
    }
}