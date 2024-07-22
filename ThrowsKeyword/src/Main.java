import java.util.*;
class MyCalculator
{
	int power(int a,int b)throws Exception
	{
		if(a==0&& b==0)
		{
			throw new Exception("the value of a and b should not be zero");
		}
		else if(a<0 && b<0)
		{
			throw new Exception("the value of a and b should not be negative"); 
		}
		else if(a<0 || b<0)
		{
			throw new Exception("the value of a or b should not be negative"); 
		}
		else
		return (int) Math.pow(a,b);
	}
}
public class Main {

	public static void main(String[] args) {
		try
		{
			MyCalculator c=new MyCalculator();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of a:");
			int a=sc.nextInt();
			System.out.println("enter the value of b:");
			int b=sc.nextInt();
			int p= c.power(a,b);
			System.out.println("power:"+p);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("program executed..");
		}
	}
}
