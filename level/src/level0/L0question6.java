package level0;
import java.util.Scanner;
public class L0question6 {

	void printdes(int start,int  end)
	{
		for(int i=end-1;i>start;i--)
		{
			System.out.println(i);
			if(i==start)
			{
				break;
			}
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
		System.out.println("enter the start and end value");
		int s=in.nextInt();
		int e=in.nextInt();
		L0question6  obj=new L0question6();
		obj.printdes(s, e);
		in.close();
	}
}
