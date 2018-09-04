package level2;
import java.util.Scanner;
public class L2question5 
{
	public static void main(String args[])
	{    int i;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=in.nextLine();
		/*String s1=str.replace("zoho", "test");
		String s2=s1.replace("ZoHo", "TeSt");
		System.out.println(s2);*/
		//char[] ch=str.toCharArray();
		System.out.println("enter find String:");
		String find=in.nextLine();
		char[] find1=find.toCharArray();
		System.out.println("enter the replace string:");
		String rep=in.nextLine();
		char[] rep1=rep.toCharArray();
		String[] words=str.split(" ");
		int len=words.length;
		System.out.println("length of words:"+len);
		for(i=0;i<len;i++)
		{
			System.out.println(words[i]);
		}
		if(find.length()!=rep.length())
		{
			System.out.println("enter the valid input");
			
		}
		else
		{  System.out.println("replaced statement");
		for(i=0;i<len;i++)
		{
			if((words[i].equalsIgnoreCase(find))==true)
			{    
				int size=find.length();
				for(i=0;i<size;i++)
				{
					if(find1[i]>=97 && find1[i]<=122)
					{     
						char a=Character.toLowerCase(rep1[i]);
						System.out.print(a);
					}
					else if(find1[i]>=65 && find1[i]<=90)
					{
						char a=Character.toUpperCase(rep1[i]);
						System.out.print(a);
					}
				}
			}
			else if(words[i].equalsIgnoreCase(find)==false)
			{
				System.out.print(words[i]);
			}
		}
		
		}
	
		in.close();
    }

}
