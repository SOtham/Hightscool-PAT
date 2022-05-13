package MultiLaunchPro;


/**
 *
 * @author Sameer Otham
 */

public class User_Data
{
    //variables
    private String Firstname, Surname, Username, Password , DateOfBirth;
    private int UserID;
    private boolean Administrator, Restricted;
    
    //constructor
    public User_Data(String Fname, String Sname, String Uname, String Pass, int UID, String DOB, boolean admin, boolean res)
    {
        Firstname = Fname;
        Surname = Sname;
        Username = Uname;
        Password = Pass;
        UserID = UID;
        DateOfBirth = DOB;
        Administrator = admin;
        Restricted = res;
    }

    //getters and setters
    public int getUserID()
    {
        return UserID;
    }

    public void setUserID(int UserID)
    {
        this.UserID = UserID;
    }

    public boolean isAdministrator()
    {
        return Administrator;
    }

    public void setAdministrator(boolean Administrator)
    {
        this.Administrator = Administrator;
    }

    public boolean isRestricted()
    {
        return Restricted;
    }

    public void setRestricted(boolean Restricted)
    {
        this.Restricted = Restricted;
    }

    public String getFirstname()
    {
        return Firstname;
    }

    public void setFirstname(String Firstname)
    {
        this.Firstname = Firstname;
    }

    public String getSurname()
    {
        return Surname;
    }

    public void setSurname(String Surname)
    {
        this.Surname = Surname;
    }

    public String getUsername()
    {
        return Username;
    }

    public void setUsername(String Username)
    {
        this.Username = Username;
    }

    public String getPassword()
    {
        return Password;
    }

    public void setPassword(String Password)
    {
        this.Password = Password;
    }

    public String getDateOfBirth()
    {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth)
    {
        this.DateOfBirth = DateOfBirth;
    }



    
}
