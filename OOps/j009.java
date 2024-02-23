import java.util.Scanner;

class j009
{
	public static void main(String ar[])
	{
		int arr[]=new int[20];
		int sumo=0,sume=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		    if(arr[i]%2==0)
			 sume=sume+arr[i];
			else
			sumo=sumo+arr[i];
	    }
		System.out.println("sum of even Number = "+sume);
		System.out.println("sum of odd Number = "+sumo);
		
	}
}