package p1;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// TODO Auto-generated method stub
			System.out.println("Enter the Number");
				int a=sc.nextInt();
				int temp=a;
				int sum=0;
				int product=1;
				while(a>0)
				{
					int r=a%10;
					sum=sum+r;
					product=product*r;
					a=a/10;
				}
				if(sum==product)
				{
					System.out.print(temp + " is a spy Number");
				}
				else
				{
					System.out.print(temp + " is Not a spy Number");
				}
		}
	}

}
