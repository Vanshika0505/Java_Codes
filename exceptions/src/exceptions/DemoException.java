package exceptions;
import java.util.Scanner;
public class DemoException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		int arr[]= {1,2,3,4,5};
		try
		{
			arr[5]=10;
		}
		catch(Exception e)
		{
			System.out.println("Exception caught:"+e);
		}
		try
		{
			System.out.println("enter a:");
			a=sc.nextInt();
			System.out.println("enter b:");
			b=sc.nextInt();
			System.out.println("div :"+a/b);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught:"+e);
		}
		try
		{
			System.out.println("enter a:");
			a=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught:"+e);
		}
	}

}
