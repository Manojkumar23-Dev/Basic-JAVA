class calculation
{
public void add(int a, int b)
{
System.out.println(a+b);
}
public void add(double a, double b)
{
System.out.println(a+b);
}
public static void main(String[]args)
{
calculation c=new calculation();
c.add(3,4);
c.add(13.6, 16.4);
}
}