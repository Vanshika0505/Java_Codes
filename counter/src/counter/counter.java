package counter;

public class counter {
	static int c=0;
	{
		c++; //instance block can be used instead of using c++ in each constructor
	}
	counter()
	{
		//c++;
	}
	counter(int x)
	{
		//c++;
	}
	counter(String y)
	{
		//c++;
	}
	public static void main(String args[])
	{
		counter c1=new counter();
		counter c2=new counter(4);
		counter c3=new counter("yes");
		counter c4=new counter();
		System.out.println("number of instances="+c);
	}
}
