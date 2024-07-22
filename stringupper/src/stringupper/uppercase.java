package stringupper;

import java.util.*;

public class uppercase {
	static void Convertupper(String str)
	{
		String newch="";
		char ch=str.charAt(0);
		newch=newch+Character.toUpperCase(ch);
		for(int i=1;i<str.length();i++)
		{ 
			if(str.charAt(i)==' '&&str.charAt(i+1)!=' ')
			{
				newch=newch+str.charAt(i);
				ch=str.charAt(i+1);
				newch=newch+Character.toUpperCase(ch);
				i++;
			}
			else
			{
				newch=newch+str.charAt(i);
			}
		}
		System.out.println("new string="+newch);
	}
	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		String input= sc.nextLine();
		Convertupper(input);

	}

}
