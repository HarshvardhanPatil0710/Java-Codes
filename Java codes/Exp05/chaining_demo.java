class demo
{
    demo()
    {
        this(5);
        System.out.println("Default");
    }
    demo(int x)
    {
        this(5,15);
        System.out.println("The value of x is "+x);
    }
    demo(int x,int y)
    {
        this(5,15,20);
        System.out.println("The value of x and y is " + x + "," + y);
    }
    demo(int x,int y,int z)
    {
        System.out.println("The value of cube of x , y and z is"+ x*y*z);
    }
    public static void main(String args[])
    {
        new demo();
    }
}