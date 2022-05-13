package MultiLaunchPro;

import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sameer Otham
 */
public class MLProDBManager
{
   
    private Connection connect;
    String dbname = (new File("MLProDB.accdb")).getAbsolutePath();
    
    //DB Connection
    public MLProDBManager()
    {
        try
        {
            //connecting to database
            connect = DriverManager.getConnection("jdbc:ucanaccess://" + dbname);
            System.out.println("Connected to the database");

        } catch (SQLException e)
        {
            System.out.println("Connection Failed: " + e);
        }
    }

    //Ùser insert method
    public void UserInsert(String inFname, String inSname, String inUname, String inPass, String inDOB) throws SQLException
    {
        try
        {
            Statement Uin = connect.createStatement();
            String Uquery = "INSERT INTO tblUsers (Firstname, Surname, Username, Password, Date_of_Birth, Admin, Restricted )\n"
                    + "Values" + "('" + inFname + "','" + inSname + "','" + inUname + "','" + inPass + "','" + inDOB + "', false" + ", false" + ")";

            System.out.println(Uquery);
            Uin.executeUpdate(Uquery);
            JOptionPane.showMessageDialog(null, "Account Created");

        } catch (SQLException e)
        {
            System.out.println("Insert Failed");
        }

    }

    //login method
    public String login(String inUname, String inPass) throws SQLException
    {
        String outPass = "";
        Statement Login = connect.createStatement();
        String Lquery = "SELECT Username, Password\n"
                + "FROM tblUsers\n"
                + "WHERE Username = '" + inUname + "'";

        System.out.println(Lquery);
        try
        {

            ResultSet out = Login.executeQuery(Lquery);

            while (out != null && out.next())
            {
                System.out.println(out.getString("Password"));
                outPass = out.getString("Password");
                String user = "SELECT Username, Password\n"
                        + "FROM tblUsers\n"
                        + "WHERE Username = '" + inUname + "'";
            }
        } catch (SQLException e)
        {
        }
        return outPass;
    }

    //checking if username exists
    public Boolean Unamecheck(String inUname) throws SQLException
    {
        boolean check = false;
        String qret = "";
        Statement Uckeck = connect.createStatement();
        String UCquery = "SELECT Username\n"
                + "FROM tblUsers\n"
                + "WHERE Username = '" + inUname + "'";

        System.out.println(UCquery);

        ResultSet UC = Uckeck.executeQuery(UCquery);
        while (UC != null && UC.next())
        {
            qret = qret + UC.getString("Username");
        }

        boolean Usercheck = inUname.equalsIgnoreCase(qret);
        System.out.println("User input out " + inUname);
        System.out.println("Query result out " + qret);
        System.out.println("Result of boolean " + Usercheck);
        if (Usercheck == true)
        {
            check = true;
        }
        System.out.println("Output of return " + check);

        return check;
    }

    //Game insert
    public void Gameinsert(String inGname, String inPlat, String inDirec) throws SQLException
    {
        try
        {
            Statement Gamein = connect.createStatement();
            String Gquery = "INSERT INTO tblGames (GameName, Platform, Directory)\n"
                    + "Values" + "('" + inGname + "','" + inPlat + "','" + inDirec + "')";
            System.out.println(Gquery);
            Gamein.executeUpdate(Gquery);
            JOptionPane.showMessageDialog(null, "Game Added");
        } catch (SQLException e)
        {
            System.out.println("insert failed");
        }
    }

    //displays all games currently in global libary
    public ResultSet AllGames() throws SQLException
    {
        Statement AllGames = connect.createStatement();
        String AllGamesQuery = "SELECT * \n"
                + "FROM tblGames\n";

        ResultSet ret = AllGames.executeQuery(AllGamesQuery);
        return ret;
    }

    //Create user object
    public User_Data UserCreate(String inUname) throws SQLException
    {
        User_Data User;

        Statement UC = connect.createStatement();
        String UCreateQuery = "Select *\n"
                + "From tblUsers\n"
                + "WHERE Username ='" + inUname + "'";

        System.out.println(UCreateQuery);

        ResultSet result = UC.executeQuery(UCreateQuery);

        String Fname = "";
        String Sname = "";
        String Uname = "";
        String Pass = "";
        int UID = 0;
        String DOB = "";
        boolean admin = false;
        boolean res = false;

        while (result != null && result.next())
        {
            Fname += result.getString("Firstname");
            Sname += result.getString("Surname");
            Uname += result.getString("Username");
            Pass += result.getString("Password");
            UID += result.getInt("UserID");
            DOB += result.getString("Date_of_Birth");
            admin = result.getBoolean("Admin");
            res = result.getBoolean("Restricted");
        }

        User = new User_Data(Fname, Sname, Uname, Pass, UID, DOB, admin, res);
        return User;
    }
    
    //adds games to users library
    public void LibAdd(int GameID, User_Data outUser, String GameName) throws SQLException
    {
        int temp = outUser.getUserID();
        Statement Game = connect.createStatement();

        String add = "Insert into tblLibrary(UserID, GameID)\n"
                + "Values(" + temp + "," + GameID + ")";

        int option = JOptionPane.showConfirmDialog(null, "Would you like to add " + GameName + " to your library");

        if (option == 0)
        {
            System.out.println(add);
            Game.executeUpdate(add);
        }
    }

    //gets a users library
    public ResultSet getLib(User_Data User) throws SQLException
    {
        int temp = User.getUserID();
        Statement UserLib = connect.createStatement();
        String lib = "SELECT tblGames.GameID, GameName, Platform, tblLibrary.Favourite, Directory\n"
                + "FROM tblLibrary, tblUsers, TblGames \n"
                + "WHERE tblUsers.UserID =  tblLibrary.UserID AND tblLibrary.GameID = tblGames.GameID AND tblUsers.UserID = " + temp;

        ResultSet libar = UserLib.executeQuery(lib);

        return libar;
    }

    //deletes a user
    public void UserDelete(int UserID) throws SQLException
    {
        Statement delete = connect.createStatement();
        String del = "DELETE *\n"
                + "FROM tblUsers\n"
                + "WHERE UserID = " + UserID;
        delete.executeUpdate(del);
        System.out.println("Deleted");
    }

    //updates users details
    public void UserUpdate(User_Data outUser, String upFname, String upSname, String upUname, String upPass) throws SQLException
    {
        Statement update = connect.createStatement();
        String up = "UPDATE tblUsers\n"
                + "SET Firstname = '" + upFname + "', Surname = '" + upSname + "',  Username = '" + upUname + "', Password = '" + upPass + "'\n"
                + "WHERE UserID = " + outUser.getUserID();
        System.out.println(up);

      }

    //gets restricted games
    public ResultSet ResGames() throws SQLException
    {
        Statement ResGames = connect.createStatement();
        String ResGamesQuery = "SELECT GameID, GameName, Platform, Directory \n"
                + "FROM tblGames\n"
                + "Where Restricted = true";

        ResultSet res = ResGames.executeQuery(ResGamesQuery);

        return res;
    }

    //gets all users grom tblUsers
    public ResultSet AllUsers() throws SQLException
    {
        Statement AllUsers = connect.createStatement();
        String query = "SELECT *\n"
                + "From tblUsers";

        ResultSet ret = AllUsers.executeQuery(query);

        return ret;
    }

    //adds or removes admin staus from a user
    public void ChangeAdmin(int UserID, int AdminChoice) throws SQLException
    {
        switch (AdminChoice)
        {
            case 0:
                Statement makeAdmin = connect.createStatement();
                String query = "UPDATE tblUsers\n"
                        + "Set Admin = true\n"
                        + "Where UserID = " + UserID;

                makeAdmin.executeUpdate(query);
                break;

            case 1:
                Statement RemoveAdmin = connect.createStatement();
                String Remquery = "UPDATE tblUsers\n"
                        + "Set Admin =  false\n"
                        + "Where UserID = " + UserID;

                RemoveAdmin.executeUpdate(Remquery);
                break;

            default:
                throw new AssertionError();
        }
    }

    //adds or removes Restricted staus from a user
    public void restrictUser(int UserID, int RestricChoice) throws SQLException
    {
        switch (RestricChoice)
        {
            case 0:
                Statement ResUser = connect.createStatement();
                String query = "UPDATE tblUsers\n"
                        + "Set Restricted = true\n"
                        + "Where UserID = " + UserID;
                System.out.println("1");

                ResUser.executeUpdate(query);
                break;
            case 1:
                Statement UnResUser = connect.createStatement();
                String unResquery = "UPDATE tblUsers\n"
                        + "Set Restricted = false\n"
                        + "Where UserID = " + UserID;
                System.out.println("2");

                UnResUser.executeUpdate(unResquery);
                break;
            default:
                throw new AssertionError();
        }
    }

    //removes game from user library
    public void RemoveGame(int UID, int GameID) throws SQLException
    {
        Statement RemoveG = connect.createStatement();

        String RemGQ = "Delete *\n"
                + "FROM  tblLibrary\n"
                + "WHERE UserID = " + UID + " AND GameID = " + GameID;

        RemoveG.executeUpdate(RemGQ);
    }

    //adds or removes favouite status from a game
    public void MakeFav(int UID, int GameID, int Ops) throws SQLException
    {
        Statement Fav = connect.createStatement();

        String AddFavQ = "UPDATE tblLibrary\n"
                + "Set Favourite =  true\n"
                + "Where UserID = " + UID + " AND GameID = " + GameID;
        String RemFavQ = "UPDATE tblLibrary\n"
                + "Set Favourite =  false\n"
                + "Where UserID = " + UID + " AND GameID = " + GameID;

        switch (Ops)
        {
            case 0:
                Fav.executeUpdate(AddFavQ);
                break;
            case 1:
                Fav.executeUpdate(RemFavQ);
                break;
        }
    }

    //gets favourite games
    public ResultSet ShowFav(int UID) throws SQLException
    {
        Statement Favs = connect.createStatement();

        String showfavs = "SELECT tblGames.GameID, GameName, Platform, tblLibrary.Favourite\n"
                + "FROM tblLibrary, tblUsers, TblGames\n"
                + "WHERE tblUsers.UserID =  tblLibrary.UserID AND tblLibrary.GameID = tblGames.GameID AND tblUsers.UserID = " + UID + " AND tblLibrary.Favourite = true";
        System.out.println(showfavs);

        ResultSet ret = Favs.executeQuery(showfavs);
        return ret;
    }
    // orders library by input string
    public ResultSet OrderBy(String in, int UID) throws SQLException
    {
        Statement Order = connect.createStatement();
        String OrderQ = "SELECT tblGames.GameID, GameName, Platform, tblLibrary.Favourite\n"
                + "FROM tblLibrary, tblUsers, TblGames \n"
                + "WHERE tblUsers.UserID =  tblLibrary.UserID AND tblLibrary.GameID = tblGames.GameID AND tblUsers.UserID = " + UID + "\n"
                + "ORDER BY " + in;

        System.out.println();
        ResultSet ret = Order.executeQuery(OrderQ);

        return ret;
    }
    // restricts or unrestricts game
    public void RestrictGame(int GameID, int ResUnRes) throws SQLException
    {
        Statement Restrict = connect.createStatement();

        String ResQ = "Update tblGames\n"
                + "Set Restricted = true\n"
                + "WHERE GameID = " + GameID;

        String unResQ = "Update tblGames\n"
                + "Set Restricted = false\n"
                + "WHERE GameID = " + GameID;

        switch (ResUnRes)
        {
            case 0:
                System.out.println(ResQ);
                Restrict.execute(ResQ);
                break;

            case 1:
                System.out.println(unResQ);
                Restrict.execute(unResQ);
                break;
        }
    }
    
    //checks if directory is unique to prevent have multiple of the same game
    public boolean DirecCheck(String inDirec) throws SQLException
    {
        boolean check = false;
        Statement Direcs = connect.createStatement();

        String allDirec = "SELECT Directory\n"
                + "FROM tblGames";
        ResultSet Dir = Direcs.executeQuery(allDirec);
        
        while (Dir !=null && Dir.next())
        {
        String Direc = Dir.getString("Directory");
            if (inDirec.equalsIgnoreCase(Direc))
            {
                check = true;
            }
        }
        return check;
    }
}
