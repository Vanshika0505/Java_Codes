package cmd;
public class CommandLineInput 
{
	
 public static void main(String[] args) 
 {
	 if (args.length != 5) 
	 {
		 System.out.println("Usage: java CommandLineInput <Name> <UniversityRollNo> <Course> <Class roll no> <Section>");
		 return;
	 }
	 // Extracting command line arguments
	 String name = args[0];
	 String rollNo = args[1];
	 String course = args[2];
	 String rollno = args[3];
	 String section = args[4];
	 // Displaying information
	 System.out.println("Name: " + name);
	 System.out.println("UniversityRollNo: " + rollNo);
	 System.out.println("Course: " + course);
	 System.out.println("Class roll no: " + rollno);
	 System.out.println("Section: " + section);
 }
}