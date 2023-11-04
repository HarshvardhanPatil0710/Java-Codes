import java.io.*;
import java.util.Scanner;
interface stackoperation
{
    public void push(int i);
    public void pop();
}
class Astack implements stackoperation
{
    int stack[]=new int[5];
    int top=-1;
    int i;  
    public void push(int item)
    {
        if(top>=4)
        {
            System.out.println("overflow");
        }
        else
        {
            top=top+1;  
            stack[top]=item;
            System.out.println("item pushed is "+stack[top]);
        }
    }
    public void pop()
    {
        if(top<0)
        {
            System.out.println("underflow");
        }
        else
        {
            System.out.println("item popped"+stack[top]);
            top=top-1;
        }
    }
    public void display()
    {
        if(top<0)
        {
            System.out.println("No Element in stack");
        }
        else
        {
            for(i=0;i<=top;i++)
            System.out.println("element:"+stack[i]);
        }
    }
}
class stackADT
{
    public static void main(String args[]) throws IOException 
    {
        int ch,c;
        int i;
        Astack s=new Astack();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("ARRAY STACK");      
            System.out.println("\n1.push\n2.pop\n3.display\n4.exit");
            System.out.println("enter ur choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the value to push:");
                i=sc.nextInt();
                s.push(i);
                break;
                case 2:
                s.pop();
                break;
                case 3:
                System.out.println("The elements are:");
                s.display();
                break;
                case 4:
                break;
            }
        System.out.println("Do u want to continue 0 to quit and  1 to continue ");
        c=sc.nextInt();
        }
        while(c==1);
    }
}