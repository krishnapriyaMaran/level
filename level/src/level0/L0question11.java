package level0;
import java.util.Scanner;
public class L0question11 {
	public static void main(String args[])
	{
    int i;		
	System.out.println("enter the string:");
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	System.out.println("concat");
	String s1=str.concat("&Happy");
	System.out.println(s1);
    System.out.println("replace with space");
    System.out.println(s1.replace('&',' '));
    char[] ch1=s1.toCharArray();
    
    System.out.println("index of H");
    int len1=s1.length();
    for(i=0;i<len1;i++)
    {
    	if(ch1[i]=='H')
    	{
    		System.out.println(i);
    	}
    }
    //int len1=s1.length();
    System.out.println("length of string:"+len1);
    System.out.println("reverse");
    for(i=len1-1;i>=0;i--)
    {
    	System.out.print(ch1[i]);
    }
    in.close();
}
}
