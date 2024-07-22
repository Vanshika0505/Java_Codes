package sumofdigits;
import java.util.Scanner;
public class sum {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.print("enter the value of x:");
		x=sc.nextInt();
		int sum=0;
		while(x!=0)
		{
			sum=sum+x%10;
			x=x/10;
		}
		System.out.print("sum of digits of the number:"+sum);
	}
}