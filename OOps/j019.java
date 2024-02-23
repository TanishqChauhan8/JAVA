import java.util.Scanner;

class j019
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of student : ");
		int n=sc.nextInt();
		int Rollno[]=new int[n];
		int markse[]=new int[n];
		int marksp[]=new int[n];
		int marksc[]=new int[n];
		int marksm[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter the Roll no of student "+(i+1)+" : ");
			Rollno[i]=sc.nextInt();
			System.out.println("Enter his marks in Englih : ");
			markse[i]=sc.nextInt();
			System.out.println("Enter his marks in chemistry : ");
			marksc[i]=sc.nextInt();
			System.out.println("Enter his marks in physics : ");
			marksp[i]=sc.nextInt();
			System.out.println("Enter his marks in Mathematics : ");
			marksm[i]=sc.nextInt();
		}
		System.out.println("\nResult---->\n");
		
		for(int i=0;i<n;i++)
		{
			if(markse[i]>35 && ((marksc[i]>35 && marksm[i]>35) || (marksp[i]>35 && marksm[i]>35) || (marksp[i]>35 && marksc[i]>35))
			{		
				System.out.println("\nROLL NO- "+Rollno[i]);
				System.out.println("Promotion is Granted");
			}
			else
			{
				System.out.println("\nROLL NO- "+Rollno[i]);
				System.out.println("promotion not Granted");
			}
			
		}
	}
}