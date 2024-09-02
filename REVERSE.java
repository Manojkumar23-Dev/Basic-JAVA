package REVERSE;
import java.util.Scanner;
public class REV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int a=sc.nextInt();
		int temp=a;
		int rev=0;
		while(a>0)
		{
			int r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		System.out.print("Reverse Number of " + temp + " is " + rev + "." );

	}

}
