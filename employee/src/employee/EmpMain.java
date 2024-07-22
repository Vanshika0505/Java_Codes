package employee;
import java.util.*;
public class EmpMain {
	public static void main(String args[])
	{
		String name;
		int empid,depid;
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name of employee:");
			name=sc.nextLine();
			System.out.println("enter employee ID:");
			empid=sc.nextInt();
			System.out.println("enter department ID:");
			depid=sc.nextInt();
			try
			{
				if(empid<2001||empid>5001)
				{
					throw new Exception("employee id is not in range 2001 to 5001.");
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception caught:"+e);
			}
			try
			{
				if(depid<1||depid>5)
				{
					throw new Exception("department id is not in range 1 to 5.");
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception caught:"+e);
			}
			try
			{
				if(name.charAt(0)<'A'||name.charAt(0)>'Z')
				{
					throw new Exception("First letter should be capital.");
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception caught:"+e);
			}
			System.out.println("employee name:"+name);
			System.out.println("employee ID:"+empid);
			System.out.println("Department ID:"+depid);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught:"+e);
		}
	}
}
