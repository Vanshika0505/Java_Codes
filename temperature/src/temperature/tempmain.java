package temperature;
import java.util.Scanner;
abstract class temperature
{
	double temp;
	void settemp(double temp1)
	{
		temp=temp1;
	}
	abstract void changetemp();
}
class ftoc extends temperature
{
	double t;
	void changetemp()
	{
		t=(temp-32)*5/9;
		System.out.println("the temperature in celcius is:"+t);
	}
}
class ctof extends temperature
{
	double t;
	void changetemp()"""
			
			"""
	{
		t=(temp*9/5)+32;
		System.out.println("the temperature in fahrenheit is:"+t);
	}
}
public class tempmain {

	public static void main(String[] args) {
		ftoc f=new ftoc();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter temperature in fahrenheit:");
		double ff=sc.nextDouble();
		f.settemp(ff);
		f.changetemp();
		ctof c=new ctof();
		System.out.println("enter temperature in celcius:");
		double cc=sc.nextDouble();
		c.settemp(cc);
		c.changetemp();
	}

}
