class methodoverloading
{
    int mul(int x, int y) 
    { 
        return (x * y); 
    }
    int mul(int x, int y, int z)
    {
        return (x * y * z);
    }
    double mul(double x, double y)
    {
        return (x * y);
    }
    public static void main(String args[])
    {
        methodoverloading m = new methodoverloading();
        System.out.println(m.mul(10, 20));
        System.out.println(m.mul(10, 20, 30));
        System.out.println(m.mul(10.5, 20.5));
    }
}