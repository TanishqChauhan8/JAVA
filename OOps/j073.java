import java.util.Scanner;

class j073
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		int n;
		System.out.print("Enter the Number of Student : ");
		n=sc.nextInt();
		String a[]=new String [n];
		String b[]=new String [n];
		sc=new Scanner (System.in);
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the Name of the Student : ");
			a[i]=sc.nextLine();
		}
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				
				if(a[i].charAt(0)>a[j].charAt(0))
				{
						b[i]=a[j];
						a[j]=a[i];
						a[i]=b[i];
				}
			}
		}	
		
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}