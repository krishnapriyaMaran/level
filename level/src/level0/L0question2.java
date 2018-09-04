package level0;
import java.util.Scanner;
public class L0question2 {
	void check(int age,int  state)
	{
		if((state==1)&&(age>18 && age <60))
		{
			System.out.println("true");
		}
		else if((state==1)&&(age<18 && age>60))
		{
			System.out.println("false");
		}
		else if((state==0)&&(age>15))
		{
			System.out.println("true");
		}
		else if((state==0)&&(age<15))
		{
			System.out.println("false");
		}
	
	}
	public static void main(String args[])
	{    int num;
		Scanner in=new Scanner(System.in);
		System.out.println("enter age:");
		int a=in.nextInt();
		System.out.println("enter the state:");
		String str=in.next();
		L0question2 obj=new L0question2();
		if(str=="TN"||str =="KA" || str=="KL")
		{
			num=1;
		System.out.println(num);
		obj.check(a,num);
		}
		else
		{
			num=0;
			System.out.println(num);
			obj.check(a,num);
		}
		in.close();
		
	}

}
