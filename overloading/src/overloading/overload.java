package overloading;
class overload1
{
	void display() {
		System.out.println("no parameter");
	}
	int display(int x)
	{
		return x;
	}
	void display(int x,int y)
	{
		System.out.println("x="+x+" y="+y);
	}
	double display(double x)
	{
		return x;
	}
}
public class overload {

	public static void main(String[] args) {
		overload1 obj=new overload1();
		obj.display();
		System.out.println("x="+obj.display(10));
		obj.display(20,30);
		System.out.println("x="+obj.display(10.0));
	}

}
