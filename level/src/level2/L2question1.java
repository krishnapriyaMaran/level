package level2;
import java.util.Scanner;
public class L2question1 {
	
	 boolean palindrome(String str)
	{
		int[] count=new int[256];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		int odd=0;
		for(int i=0;i<256;i++)
		{
			if((count[i]&1)!=0)
			
				odd++;
			if(odd>1)
				return false;
		}
		return true;
		}
	
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter the string:");
		L2question1 obj=new L2question1();
		String str=in.nextLine();
	    System.out.println(obj.palindrome(str)?"yes":"no");
	    in.close();
		
	}

}
