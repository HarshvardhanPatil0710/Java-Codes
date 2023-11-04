import java.util.Scanner;
 
class NegativeAmtException extends Exception
{
    String msg;
    NegativeAmtException(String msg)
    {
        this.msg=msg;
    }
    public String toString()
    {
        return msg;
    }
}
public class User_Defined_Exception 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Amount:");
        int a=sc.nextInt();
        try
        {
            if(a<0)
            {
                throw new NegativeAmtException("You have put the wrong amount");
            }
            System.out.println("Amount Deposited");
        }
        catch(NegativeAmtException e)
        {
            System.out.println(e);
        }
    }
}