package primenumber;

public class prime {

	public static void main(String[] args) {
		int f=0,i,j;
		for(i=2;i<=50;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					f++;
				}
			}
			if(f==2)
			{
				System.out.println(i);
			}
			f=0;
		}
		
	}

}
