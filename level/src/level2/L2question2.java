package level2;
import java.util.Scanner;
public class L2question2 {
	public static void main(String args[])
	{    int i,z;
		System.out.println("enter the size of array:");
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the array elements:");
		for(i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("enter the order:");
		int m=in.nextInt();
		
		System.out.println("enter the sequence:");
	
		if(size%2!=0)
		{
			z=(size/m)+1;
		}
		else
		{
			z=size/m;
		}
		double a=Math.ceil(size/m);
		int b=(int)a;
		System.out.println(b);
		int[] seq=new int[b];
		for(i=0;i<a;i++)
		{
		    seq[i]=in.nextInt();
		}
		for(i=seq[i]*m-m;i<size;i++)
		{
			System.out.println(arr[i] + arr[i+1]);
		}
		in.close();
	}

}
