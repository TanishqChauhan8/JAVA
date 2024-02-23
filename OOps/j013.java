import java.util.Scanner;

class j013
{
	public static void main(String sr[])
	{
		Scanner sc=new Scanner(System.in);
		int n,avg=0,total=0,dev=0;
		System.out.println("Enter the number of students: ");
        n=sc.nextInt();
		
		sc=new Scanner(System.in);
		
		String name[]=new String[n];
		int marks[]=new int[n];
		
        for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Names of students: ");
			name[i]=sc.nextLine();
		}
		sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		    total=marks[i]+total;
		}
		avg=total/n;
		System.out.println("Average = "+avg);
		dev=total-avg;
		System.out.println("Deviation is "+dev);
	}
}