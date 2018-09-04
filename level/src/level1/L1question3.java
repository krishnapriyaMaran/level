package level1;

import java.util.Scanner;

public class L1question3 {
	public static void main(String args[])
	{    int i;
		System.out.println("enter the email id:");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		//L1question3 obj=new L1question3();
		char[] ch=str.toCharArray();
		int len=str.length();
		//obj.lastword(str, len);
	     char c=str.charAt(0);
	     int a=c;
	     if(a>=97 && a<=121)
	     {
	    	 //System.out.println("yes");
	    	 for(i=0;i<len;i++)
	    		{
	    			if(ch[i]=='@')
	    			{
	    			 
	    			 for(int j=i;j<len;j++)
	    			 {
	    				 if(ch[j+1]=='.')
	    				 {
	    					 System.out.println("not valid");
	    					 break;
	    				 }
	    				 if(ch[j+1]!='.')
	    				 {
	    					 if(ch[j+2]=='.')
	    					 {
	    						// System.out.println("happy");
	    						 //obj.lastword(str,len);

	    						    String last="";
	    						    String cmp="com";
	    							last=last+str.charAt(len-3)+str.charAt(len-2)+str.charAt(len-1);
	    					      if(last.equals(cmp)==true)
	    					      {
	    					     	  System.out.println("valid");
	    					     	  break;
	    					    	  //return 1;
	    					      }
	    					      else
	    					      {
	    					    	  System.out.println("not valid");
	    					    	  break;
	    					      }
	    				 }
	    			 }
	    			 }
	    			 break;
	    			}
	    		}
	     }
	     else
	     {
	    	 System.out.println("not valid");
	     }
		
		in.close();
		
	}

}
