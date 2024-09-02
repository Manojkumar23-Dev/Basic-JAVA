abstract class parts {
	String n;
	parts(String n)
	{
		this.n=n;
	}
	abstract void function();
	void f()
	{
		System.out.println(n);
	}
	

}
class Brakes extends parts
{
	Brakes(String n)
	{
		super(n);
	}
	void function()
	{
	System.out.println("Car Should be Halted");
	}
}
class Accelerator extends parts
{
	Accelerator(String n)
	{
		super(n);
	}
	void function()
	{
	System.out.println("Car is Acclerating");
	}
}
class Gear extends parts
{
	int ge;
	Gear(String n, int ge)
	{
		super(n);
		this.ge=ge;
	}
	void function()
	{
	System.out.println("car should be moving"+ 5);
	}
}
class car
{
	public static void main(String[]args)
	{
	
		Brakes b=new Brakes("Brakes");
		b.function();
		b.f();
		Accelerator a=new Accelerator("Accelerator");
		a.function();
		a.f();
		Gear g=new Gear("Gear",5);
		g.function();
		g.f();
	}
}
