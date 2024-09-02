class Guest
{
    public void read()
    {
        System.out.println("Read Code");
    }
}
class Developer extends Guest
{
    public void write()
    {
        System.out.println("Write Code");
    }
}
class Admin extends Developer
{
    public void manage()
    {
        
        System.out.println("manage code");
    }
}
class user
{
    public static void main(String[]args)
    {
        Guest G=new Guest();
        G.read();
        Developer d=new Developer();
        d.read();
        d.write();
        Admin a=new Admin();
        a.read();
        a.write();
        a.manage();
    }
}