package constructor;

public class Book {

		String title,author;
		float price;
		Book()
		{
			title="A place called home";
			author="Preeti Shenoy";
			price=350;
		}
		Book(String a, String b)
		{
			title= a;
			author=b;
			price=300;
		}
		void display()
		{
			System.out.println("title="+title+"\nauthor="+author+"\nprice="+price);
		}
		public static void main(String[] args)
		{
			Book b=new Book();
			Book b1=new Book("Harry Potter","J.K Rowling");
			b.display();
			b1.display();
		}

}
