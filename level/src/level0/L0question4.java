package level0;
import java.util.Scanner;
public class L0question4 {
	void printnumbers(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(i);
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
		System.out.println("enter the value:");
		int a=in.nextInt();
		L0question4 obj=new L0question4();
		obj.printnumbers(a);
		in.close();
	}

}
