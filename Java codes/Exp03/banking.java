import java.util.Random;
import java.util.Scanner;
class banking
{
    static double amount; 
    Scanner s2 = new Scanner(System.in);
    public static void main(String args[])
    {
        Scanner s1 = new Scanner(System.in);
        int num;
        String name,address,city,state,pincode;
        long phone_no ;
        Random rand = new Random();
        System.out.println("Do you Want to create your account : 1. Yes  2. No");
        System.out.println("Enter your choice : ");
        alp = s1.nextInt();
        System.out.println("Enter your Name : ");
        name = s1.nextLine();
        System.out.println("Enter Address : ");
        address = s1.nextLine();
        System.out.println("Enter City : ");
        city = s1.nextLine();
        System.out.println("Enter State : ");
        state = s1.nextLine();
        System.out.println("Enter Pin Code : ");
        pincode = s1.nextLine();
        System.out.println("Enter Phone Number : ");
        phone_no = s1.nextLong();
        System.out.println("Enter Balance - ");
        amount = s1.nextDouble();
        System.out.println("\nDisplaying Registered Information with Account Number : ");
        System.out.println("\nName :"+name+"\nAddress :"+address+"\nCity:"+city+"\nState:"+state+"\nPin Code:"+pincode+"\nPhone Number:"+phone_no);
        int int_random = rand.nextInt(9999999);
        System.out.println("Your Account Number - " + int_random);
        do
        {
            System.out.println("\n************Choose any one option from below**************");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Compute Interest");
            System.out.println("4. Display your Balance");
            System.out.println("5. Exit");
            System.out.println("\nEnter Your Choice : ");
            num = s1.nextInt();
            banking b1 = new banking();
            switch(num)
            {
                case 1:
                {
                    b1.Withdraw();
                    break;
                }
                case 2:
                {
                    b1.Deposit();
                    break;
                }
                case 3:
                {
                    b1.ComputeInterest();
                    break;
                }
                case 4:
                {
                    b1.displaybalance();
                    break;
                }
                default :
                {
                    System.out.println("Invalid Choice");
                    break;
                }
            }
        }
        while(num != 5);
    }
    void Withdraw()
    {
        System.out.println("Enter the Amount you wanna withdraw : ");
        double a = s2.nextDouble();
        if(a > amount)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            System.out.println("The amount withdrawn is " + a);
            amount = amount - a;
        }
    }
    void Deposit()
    {
        System.out.println("Enter The Amount You Want To Deposit: ");
        double c =s2.nextDouble();
        amount = amount + c;
        System.out.println("The amount has been Succesfully Deposited");
    }
    public void ComputeInterest()
    {
        System.out.print("Enter the Principal Amount : ");
        double p=s2.nextDouble();   
        System.out.print("Enter the Rate of interest (in %): ");
        double r=s2.nextDouble()/100;
        System.out.print("Enter time period in years:");
        double t=s2.nextDouble();
        double i=(p*r*t)/100;
        System.out.println("The compute Interest is " + i);
    }
    public void displaybalance()
    {
        System.out.println("The amount in the account is : " + amount);
    }
}