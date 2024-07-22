package countvowels;
import java.util.*;
public class vowels {
	static int Count(String str)
	{
		int count=0; 
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u')
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		String input= sc.nextLine();
		int iv= Count(input);
		System.out.println("Number of vowels are:"+iv);
	}
}
