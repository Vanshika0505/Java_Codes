package anagrams;
import java.util.Scanner;
public class anagram {
	public void Sort(char arr[])
	{
		for(int i=0;i<(arr.length)-1;i++)
		{
			for(int j=1;j<(arr.length)-1-i;j++) 
			{
				if(arr[j]>arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		anagram a=new anagram();
		System.out.println("enter the first string:");
		String s1=sc.nextLine();
		char[] arr=s1.toCharArray();
		System.out.println("enter the second string:");
		String s2=sc.nextLine();
		char[] arr1=s2.toCharArray();
		int flag=0;
		if(s1.length()!=s2.length())
		{
			flag=0;
		}
		else
		{
			a.Sort(arr);
			a.Sort(arr1);
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==arr1[i])
				{
					flag=1;
				}
				else
					flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("anagram.");
		}
		else
			System.out.println("not an anagram.");
	}

}
