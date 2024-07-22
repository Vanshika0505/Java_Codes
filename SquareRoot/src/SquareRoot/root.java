package SquareRoot;
import java.util.Scanner;
import java.lang.Math;
public class root {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		double rt=0;
		System.out.print("enter the number:");
		x=sc.nextInt();
		rt=Math.sqrt(x);
		System.out.print("square root of the number is:"+rt);
	}

}
