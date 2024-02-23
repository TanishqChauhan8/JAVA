import java.util.Scanner;

class j024
{
	public static void main(String ar[])
	{
		int n,min,temp,y,l=0,mid=0,f=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number of Years for which Data Exists : ");
		n=sc.nextInt();
		int u=n-1;
		System.out.println("Enter the Years for which  Data Exists : ");
		int year[]=new int[n];
		for(int i=0;i<n;i++)
			year[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			min=i;
		for(int j=i+1;j<n;j++)
		{
			if(year[j]<year[min])
			{
				min=j;
			}
		}
		if(min!=i)
		{
			temp=year[i];
			year[i]=year[min];
			year[min]=temp;
		}
		}
		System.out.println("Enter the Year that u Want to search : ");
		y=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			mid=(l+u)/2;
			if(y==year[mid])
			{
				f=1;
				break;
			}
			else if(y>year[mid])
				l=mid+1;
			else
				u=mid-1;
		}
		if(f==1)
			System.out.println("Record exists ");
		else
			System.out.println("Record Not found ");
	}
}