package constructorchaining;
class a
{
	a()
	{
		System.out.println("default constructor of class A");
	}
}
class b extends a
{
	b()
	{
		System.out.println("default constructor of class B");
	}
}
class c extends b
{
	c()
	{
		System.out.println("default constructor of class C");
	}
}
public class defaultmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj=new c();

	}

}
