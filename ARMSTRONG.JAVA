import java.util.Scanner;
class ARM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arm=0,temp=a,c=0;
		while(temp>0)
		{
			temp=temp/10;
			c++;
		}
		temp=a;
		while(temp>0)
		{
			int r=temp%10;
			arm=arm+(int)Math.pow(r, c);
			temp=temp/10;
		}
		if(arm==a)
		{
			System.out.println("Armstronng Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}

	}

}