import java.util.Scanner;

class ABC
{
	static void insertion(int i,int a[],int n)
	{
		int j,min;
		if(i<n)
		{
		  min=a[i];
		  for(j=i-1;j>=0 && min<a[j];j--)
		  {
			a[j+1]=a[j];
		  }
			a[j+1]=min;

		  insertion(i+1,a,n);
		}
	}

	public static void main(String ar[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of the Array : ");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Element into the array : ");
			a[i]=sc.nextInt();
		}
		insertion(1,a,n);

		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}
}
		