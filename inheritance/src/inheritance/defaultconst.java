package inheritance;
class A
{
	int x,y;
	A(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("x+y="+(x+y));
	}
}
class B extends A
{
	int x;
	B(int x, int y,int z)
	{
		super(x,y);
		x=z;
		System.out.println("x+y+z="+(super.x+y+x));
	}
}
class C extends B
{
	C()
	{
		super(10,20,30);
		System.out.println("I am in class C");
	}
}
public class defaultconst {

	public static void main(String[] args) {
		C obj=new C();
	}

}
