class customer
{
	private int id;
	private String name;
	private long num;
	public customer(int id, String name, long num)
	{
	  this.id=id;
	  this.name=name;
	   this.num=num;
	}
	 public int getId()
	{
	return id;
	}
	public String getName()
	{
	 return name;
	}
	public long getNum()
	{
	 return num;
	}
public static void main(String[]args)
{
customer c=new customer(1, "Manoj" , 9283743984l);
System.out.println(c.getId());
System.out.println(c.getName());
System.out.println(c.getNum());

}
}
