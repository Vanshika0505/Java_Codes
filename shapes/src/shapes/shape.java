package shapes;

public class shape {
	String name;
	public shape(String name)
	{
		this.name=name;
	}
}
class rectangle extends shape
{
	float breadth,length,area;
	public rectangle(String name,float l,float b)
	{
		super(name);
		breadth=b;
		length=l;
	}
	public void rectanglearea()
	{
		area=length*breadth;
	}
	public void display()
	{
		System.out.print("The area of rectangle is:"+area);
	}
}
class circle extends shape
{
	double radius,area;
	public circle(String name,float r)
	{
		super(name);
		radius=r;
	}
	public void circlearea()
	{
		area=3.14*radius*radius;
	}
	public void display()
	{
		System.out.println("The area of circle is:"+area);
	}
}
class shapesmain
{
	public static void main(String args[])
	{
		rectangle r=new rectangle("rectangle",20,3);
		
	}
}