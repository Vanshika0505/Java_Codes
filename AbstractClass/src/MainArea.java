import java.util.Scanner;
abstract class shape 
{
	abstract void RectangleArea(double l,double b);
	abstract void CircleArea(double l);
	abstract void SquareArea(double r);

}
class Area extends shape
{
	double l,b,r;
	void RectangleArea(double l,double b)
	{
		this.l=l;
		this.b=b;
		System.out.println("area of rectangle is:"+l*b);
	}
	void SquareArea(double l)
	{
		this.l=l;
		System.out.println("area of square is:"+l*l);
	}
	void CircleArea(double r)
	{
		this.r=r;
		System.out.println("area of circle is:"+3.14*r*r);
	}
}
public class MainArea
{
	public static void main(String args[])
	{
		double l,b,r;
		Area a=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		l=sc.nextDouble();
		System.out.println("enter the breadth:");
		b=sc.nextDouble();
		a.RectangleArea(l,b);
		a.SquareArea(l);
		System.out.println("enter the radius:");
		r=sc.nextDouble();
		a.CircleArea(r);
	}
}
