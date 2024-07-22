package reverseString;

import java.util.Scanner;
public class reverse {
	public void rev(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			s=str.charAt(i)+s;
		}
		System.out.println("reverse string is:"+s);
		palindrome(str,s);
	}
	public void palindrome(String str,String s)
	{
		if(str.toLowerCase().equals(s.toLowerCase()))
		{
			System.out.println("palindrome.");
		}
		else 
			System.out.println("not a palindrome.");
	}
	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		String input= sc.nextLine();
		reverse r=new reverse();
		r.rev(input);
	}
}