package multithreading;
class mythread extends Thread
{
	private String name;
	private int count;
	public mythread(String name)
	{
		this.name=name;
		this.count=1;
	}
	public void run()
	{
		while (count < 5) 
		{  
            try 
            {
                Thread.sleep(500);  
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println(name + ": Execution count = " + count);
            count++;
        }
	}
}
public class threadmain {

	public static void main(String[] args) 
	{
		mythread CSthread=new mythread("CSthread");
		mythread ITthread=new mythread("ITthread");
		CSthread.start();
		ITthread.start();
	}

}
