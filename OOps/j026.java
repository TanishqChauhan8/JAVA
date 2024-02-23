import java.util.Scanner;

class j026
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		int n,m,sum=0,product=1;
		System.out.println("Enter the Number of Rows : ");
		m=sc.nextInt();
		System.out.println("Enter the Number of Columns : ");
		n=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter Element at a["+i+"]["+j+"] : ");
				a[i][j]=sc.nextInt();
			if(a[i][j]%2==0)
				sum=sum+a[i][j];
			else
				product=product*a[i][j];
			}
		}
		System.out.println("sum of all even Numbers is : "+sum);
		System.out.println("product of odd Numbers is : "+product);
	}
}
		