package ReverseNumber;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,rev=0;
		System.out.print("enter the number x:");
		x=sc.nextInt();
		while(x!=0)
		{
			rev=rev*10+x%10;
			x=x/10;
		}
		System.out.print("reverse of number is:"+rev);
	}

}
