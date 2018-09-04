package level0;
import java.util.Scanner;
public class L0question8 {
	
	public static void main(String args[])
	{

		Scanner in=new Scanner(System.in);
		System.out.println("enter the start value and end value:");
		int s=in.nextInt();
		int e=in.nextInt();
	
		for(int i=s;i<=e;i++)
		{
			for(int j=s;j<=i;j++)
			{
				if(j==i)
				{
					System.out.println(i);
				}
				if(i%j==0)
				{
					break;
				}
			}
		}
in.close();		
	}

}
