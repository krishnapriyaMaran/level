package level1;

import java.util.Scanner;

public class L1question4 {
	public static void main(String args[])
	{    int i,count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the  size:");
		int size=in.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the array elements:");
		for(i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(arr[i]%2!=0)
			{   count=count+1;
				System.out.print(arr[i]);
			}
			
		}
		for(i=0;i<size-count;i++)
		{
			System.out.print(0);
		}
		
		in.close();
	}

}
