class parent
{
public void info()
{
System.out.println("parent class");
}
}
class child extends parent
{
public void info()
{
System.out.println("child class");
}
public static void main(String[]args)
{
parent p=new parent();
p.info();
child c=new child();
c.info();
}} 