package level1;
import java.util.Scanner;
public class L1question2 {
	public static void main(String args[])
	{
		int temp,rem;
		System.out.println("enter the range:");
		Scanner in=new Scanner (System.in);
		int range=in.nextInt();
		//System.out.println("start:");
		//int start=in.nextInt();
		//System.out.println("end:");
		//int end=in.nextInt();
		for(int i=1;i<=range;i++)
		{
			temp=i;
			int rev_num=0;
			while(temp!=0)
			{
				rem=temp%10;
				temp=temp/10;
				rev_num=rev_num*10+rem;
			}	
			if(i==rev_num)
			{
				System.out.println(i);
			}
		}
       in.close();		
	}

}
