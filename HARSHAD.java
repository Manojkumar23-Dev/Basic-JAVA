package harshad;
import java.util.Scanner;
class HARSH {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int sum=0,temp=n;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		if(temp%sum==0)
		{
			System.out.println("It is a HARSHAD NUMBER");
		}
		else
		{
			System.out.println("Not  a HARSHAD NUMBER");
		}

	}

}
