package PrimeOrNot;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,i,flag=0;
		System.out.print("enter the value of x:");
		x=sc.nextInt();
		if(x==0||x==1)
		{
			System.out.print("not a prime number.");
		}
		else
		{
			for(i=2;i<=x/2;i++)
			{
				if(x%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print("Prime number.");
			}
			else
			{
				System.out.print("not a prime number.");
			}
		}
	}

}
