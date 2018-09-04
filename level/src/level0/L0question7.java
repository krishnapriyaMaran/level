package level0;

public class L0question7 {
	void create()
	{    int i;
		int[] arr=new int [100];
		for(i=0;i<100;i++)
		{
			arr[i]=i;
		}
		for(i=0;i<100;i++)
		{
		System.out.println(arr[i]);
		}
	}
		
	public static void main(String args[])
	{
	L0question7 obj=new L0question7();
	obj.create();
	}

}
