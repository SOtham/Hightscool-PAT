package MultiLaunchPro;

/**
 *
 * @author Sameer Otham
 */
public class ErrorChecking
{

    //methods to check if input data is valid
    //checks if string contains anything but letters
    public boolean NameCheck(String inFname)
    {
        boolean ans = true;

        for (int j = 0; j < inFname.length(); j++)
        {
            if (Character.isLetter(inFname.charAt(j)) == false)
            {
                ans = false;
            }
        }

        return ans;
    }
        //checks if string contains anything but letters
    public boolean SNameCheck(String inSname)
    {
        boolean ans = true;

        for (int j = 0; j < inSname.length(); j++)
        {
            if (Character.isLetter(inSname.charAt(j)) == false)
            {
                ans = false;
            }
        }

        return ans;
    }
    //checks if string contains anything but letters and numbers
    public boolean UnameCheck(String inUname)
    {
        boolean ans = true;

        for (int i = 0; i < inUname.length(); i++)
        {
            if (Character.isLetterOrDigit(inUname.charAt(i)) == false)
            {
                ans = false;
            }
        }
        return ans;
    }
    //checks if string contains anything but letters
    public boolean PassCheck(String inPass)
    {
        boolean ans = true;

        for (int i = 0; i < inPass.length(); i++)
        {
            if (Character.isLetterOrDigit(inPass.charAt(i)) == false)
            {
                ans = false;
            }
        }
        return ans;
    }
}
