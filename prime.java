package allprime;
import java.util.Scanner;

public class prime {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		int fc=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				fc++;
			}
		}
		if(fc==2)
		{
			System.out.print(a + " is a Prime Number ");
		}
		else
		{
			System.out.print(a + " is Not a Prime Number");
		}

	}

}
