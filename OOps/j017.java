import java.util.Scanner;

class j017
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total Numbers of elements to enter: ");
		int n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the Number "+(i+1)+" :");
		num[i]=sc.nextInt();
		}
		int even[]=new int[n];
		int odd[]=new int[n];
		int j=0,k=0;
		for(int i=0;i<n;i++)
		{
			if(num[i]%2==0)
			{
				even[j]=num[i];
				j++;
			}
			else
			{
				odd[k]=num[i];
				k++;
			}
		}
		System.out.println("Even Number list - ");
		for(int i=0;i<j;i++)
			System.out.println(even[i]);
		System.out.println("Odd Number list - ");
		for(int i=0;i<k;i++)
			System.out.println(odd[i]);
	}
}