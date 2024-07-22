package swaping;
import java.util.Scanner;
public class swapmain{
	public void swap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=sc.nextInt();
		System.out.println("enter the value of b:");
		int b=sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("the new value of a is:"+a);
		System.out.println("the new value of b is:"+b);
	}
	
}