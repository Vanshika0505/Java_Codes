import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class files
{
	public void createfile()
	{
		File f=new File("myfile.txt");
		try
		{
			if(f.createNewFile())
			{
				System.out.println("file created");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
			filewriting(f);
			readingfile(f);
			
			
	}
	public void readingfile(File f) 
	{
		
		try (FileReader fn = new FileReader(f)) 
		{
			int i;
			//fn.read();
			while((i=fn.read())!=-1)    
			System.out.print((char)i);    
			fn.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public void filewriting(File f)
    {
        try
        {
            FileWriter wr=new FileWriter(f);
            wr.write("hello how are you  ");
            wr.write("do you like to code ");
            wr.write("good ");
            System.out.println("writing operation completed ");
            wr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
public class demo {
	public static void main(String[] args) 
    {
		files ff=new files();
		ff.createfile();
	}

}
