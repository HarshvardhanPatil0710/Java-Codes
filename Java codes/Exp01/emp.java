import java.util.Scanner;
class emp
{
    public static void main(String args[])
    {
        String name;
        int empno;
        Double bs;
        Scanner sc = new Scanner(System.in);
        System.out.println("***********Enter your details below***********");
        System.out.println("Enter your name : ");
        name=sc.nextLine();
        System.out.println("Enter your employee number : ");
        empno=sc.nextInt();
        System.out.println("Enter your basic salary : ");
        bs=sc.nextDouble();
        Double Da = (70*bs)/100;
        Double Hra= (30*bs)/100;
        Double gs = Hra+bs+240;
        Double pf = (10*bs)/100;  
        Double IT = (30*gs)/100;
        Double ns = gs - IT - pf - 100;
        System.out.println("\n***********Displaying all the details***********");
        System.out.println("\nName: "+name);
        System.out.println("Employee Number:"+empno+"\nBasic Salary:" +bs );
        System.out.println ("DA :" +Da+" \nHRA :"+Hra +" \nGS :" +gs); 
        System.out.println("Income Tax :" +IT+"\nNet Salary :" +ns);
    }
}