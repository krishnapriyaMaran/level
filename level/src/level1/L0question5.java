package level1;
import java.util.Scanner;
public class L0question5 
{
	public static void main(String args[])
	{
		Scanner h =new Scanner(System.in);
		int n,m,k=1,i,j,r;
		System.out.println("enter the value of n");
		n=h.nextInt();
		m=n+(n-1);
		char a[][]=new char[m][m];
		for(i=0;i<n;i++)
		{
			for(j=k-1;j<k+i;j++)
			{
				a[i][j]='*';
			}
			k++;
		}
		k=k-2;
		for(r=i;r<m;r++)
		{
			for(j=k-1;j<k+(k-1);j++)
			{
				a[r][j]='*';
			}
			k--;
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		h.close();
	}
}