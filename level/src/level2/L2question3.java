package level2;
import java.util.Scanner;
public class L2question3 {
	public static void main(String args[])
	{   int i,j,k;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n=in.nextInt();
  	
		for(i=1;i<=n;i++)
		{
			for(k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1;i<=n-1;i++)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(j=n-1;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		in.close();
	}

}
