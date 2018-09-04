package level0;
import java.util.Scanner;
public class L0question9 {
	int[] a=new int[5];
	void average(int a[])
	{   
		int sum=0;
		for(int j=0;j<5;j++)
		{
			System.out.println(a[j]);
			sum=a[j]+sum;
		}
		int avg=sum/5;
		System.out.println("average:"+avg);
	}
	public static void main (String args[])
	{   int i;
	    Scanner in=new Scanner (System.in); 
		int[] arr=new int [5];
		for(i=0;i<5;i++)
		{
			arr[i]=in.nextInt();
		}
		L0question9 obj=new L0question9();
		obj.average(arr);
		in.close();
	}

}
