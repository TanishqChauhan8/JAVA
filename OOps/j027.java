import java.util.Scanner;

class j027
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n,m,sum=0,sumd=0,k=0;
		System.out.println("Enter the Number of Stores : ");
		n=sc.nextInt();
		System.out.println("Enter the Number of departments : ");
		m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("\nEnter the Monthly sale of store "+(i+1)+" department "+(j+1)+" : ");
				a[i][j]=sc.nextInt();
				sum=sum+a[i][j];
			}
			b[i]=sum;
			sum=0;
			System.out.println("\n");
		}
		for(int i=0;i<n;i++)
			System.out.println("The Sum of Sales for store "+(i+1)+" in  a month is -----> "+b[i]);
		
		System.out.println("\n");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				sumd=sumd+a[j][i];
			}
			System.out.println("Sum of sales of department "+(i+1)+" is -----> "+sumd);
			sumd=0;
		}
	}
}