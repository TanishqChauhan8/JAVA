import java.util.Scanner;

class j018
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size to insert : ");
		int n=sc.nextInt();
		int num[]=new int[n];
		int sqrt[]=new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Number : ");
			num[i]=sc.nextInt();
			for(int j=0;j<num[i];j++)
			{
				if(num[i]==j*j)
				{
					sqrt[k]=num[i];
					k++;
				}
			}
		}
		System.out.println("Perfect Numbers are ---> ");
		for(int i=0;i<k;i++)
			System.out.println(sqrt[i]);
	}
}
		