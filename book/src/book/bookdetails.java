package book;

public class bookdetails {
	String title,author;
	float price;
	bookdetails()
	{
		title="A place called home";
		author="Preeti Shenoy";
		price=350;
	}
	void display()
	{
		System.out.println("title="+title+"\nauthor="+author+"\nprice="+price);
	}
	public static void main(String[] args)
	{
		bookdetails b=new bookdetails();
		b.display();
	}
}
