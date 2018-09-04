package level0;
import java.util.Scanner;
public class Levelzero {
	
       void checkquarter(int a)
	   {
		if(a==1||a==2||a==3)
		{
			System.out.println("Quarter 1");
		}
		if(a==4||a==5||a==6)
		{
			System.out.println("Quarter 2");
		}
		if(a==7||a==8||a==9)
		{
			System.out.println("Quarter 3");
		}
		if(a==10||a==11||a==12)
		{
			System.out.println("Quarter 4");
		}
	}
       public static void main(String args[])
   	{
   		Scanner in=new Scanner(System.in);
   		System.out.println("enter the values from 1 to 12");
   		int n=in.nextInt();
   		Levelzero obj=new Levelzero();
   		if(n>13)
   		{
   			System.out.println("enter the valid input");
   		}
   		obj.checkquarter(n);
   		in.close();
   	}	

}
