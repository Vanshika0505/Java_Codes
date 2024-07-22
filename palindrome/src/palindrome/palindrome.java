package palindrome;

import java.util.*;

public class palindrome {
	static void Checkpalindrome(String str)
	{
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(str.equalsIgnoreCase(reverse));
	}
	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		String input= sc.nextLine();
		Checkpalindrome(input);
	}
}
