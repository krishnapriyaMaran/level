package level1;
import java.util.Scanner;
public class L1question1 {
    public static void main(String args[])
    {    int i,j;
    	System.out.println("enter the size of the array:");
    	Scanner in=new Scanner(System.in);
    	int size=in.nextInt();
        System.out.println("enter the array elements:");
        int [] arr=new int [size];
    	for(i=0;i<size;i++)
    	{
    		arr[i]=in.nextInt();
    	}
    	System.out.println("enter the sum value:");
    	int sum=in.nextInt();
    	for(i=0;i<size;i++)
    	{
    		for(j=1;j<size;j++)
    		{
    			int num;
    			num=arr[i]+arr[j];
    			if(sum==num)
    			{
    				System.out.println(arr[i]);
    				System.out.print(arr[j]);
    			}
    			System.out.println();
    		}
    	}
    	in.close();
    }
}
