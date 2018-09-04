package level0;
import java.util.Scanner;
public class L0question10 {
	
        
public static void main(String args[])
{    int i;
	System.out.println("enter the string:");
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	char[] ch=str.toCharArray();
	int len=str.length();
	System.out.println("uppercase");
	{  i=0;
	char c=str.charAt(i);
    System.out.print(Character.toUpperCase(c));
	}
	for(i=1;i<len;i++)
	{
		System.out.print(ch[i]);
	}
	System.out.println("reverse");
	for(i=len-1;i>=0;i--)
	{
		System.out.print(ch[i]);
	}
	System.out.println();
	System.out.println("letter at odd position:");
	for(i=0;i<len;i++)
	{
		if(i%2!=0)
		{
			System.out.print(ch[i]);
		}
	}
in.close();
}
}