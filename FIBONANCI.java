package fibonanci;
import java.util.Scanner;
public class feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a=0,b=1;
		while(a<=n)
		{
			if(a>=m)
			{
				System.out.println(a);
			}
			int c=a+b;
			a=b;
			b=c;
		}
	}

}
