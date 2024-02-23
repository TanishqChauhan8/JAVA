import java.util.Scanner;

class j023
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		int n,m;
		System.out.println("Enter the Size of array 1st : ");
		n=sc.nextInt();
		System.out.println("Enter the Size of array 2nd : ");
		m=sc.nextInt();
		int p[]= new int[n];
		int Q[]=new int[m];
		int R[]=new int[m+n];
		int c=0,k=0,t=0;
		System.out.println("Enter Element into the 1st array : ");
		for(int i=0;i<n;i++)
		{
			p[i]=sc.nextInt();
			c++;
		}
		System.out.println("Enter the Element into the 2nd array : ");
		for(int j=0;j<m;j++)
		{
			Q[j]=sc.nextInt();
			c++;
		}
		System.out.println("Element in the Array R: ");
		for(int i=0;i<n;i++)
		{
			R[i]=p[i];
			t++;
		}
		for(int j=t;j<c;j++)
		{
			R[j]=Q[k];
			k++;
		}
		for(int i=0;i<c;i++)
			System.out.println(R[i]);
	}
		
}