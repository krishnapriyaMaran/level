package level2;
import java.util.Scanner;
public class L2question6 {
       public static void main(String args[])
       {  int i,j;
    	   Scanner in=new Scanner(System.in);
    	   System.out.println("enter the value of n:");
    	   int n=in.nextInt();
    	   for(i=n;i>=1;i--)
    	   {
    		   for(j=n;j>i;j--)
    			   System.out.print(j);
    		   for(j=2*i-1;j>0;j--)
    			   System.out.print(i);
    		   for(j=i;j<n;j++)
    			   System.out.print(j+1);
    		   System.out.println();
    	   }
    	   for(i=2;i<=n;i++)
    	   {
    		   for(j=n;j>i;j--)
    			   System.out.print(j);
    		   for(j=2*i-1;j>0;j--)
    			   System.out.print(i);
    		   for(j=i;j<n;j++)
    			   System.out.print(j+1);
    		   System.out.println();
    	   }
   
  
    	   in.close();
       }
}
