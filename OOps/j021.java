import java.util.Scanner;

class j021
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Number of Student : ");
		n=sc.nextInt();
		int Rollno[]=new int[n];
		int subA[]=new int[n];
		int subB[]=new int[n];
		int subC[]=new int[n];
		int avg[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter the Roll no of Student "+(i+1)+" : ");
			Rollno[i]=sc.nextInt();
			System.out.println("Enter his marks in subject A: ");
			subA[i]=sc.nextInt();
			System.out.println("Enter his marks in subject B: ");
			subB[i]=sc.nextInt();
			System.out.println("Enter his marks in subject C: ");
			subC[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("\nAverage marks of Student "+(i+1)+" : ");
			avg[i]=(subA[i]+subB[i]+subC[i])/3;
			System.out.println(avg[i]);
		}
		System.out.println("\nStudent getting average more than 80-----> ");
		for(int i=0;i<n;i++)
		{
			if(avg[i]>80)
			{
				System.out.println("\nRoll no - "+Rollno[i]);
				System.out.println("Average marks - "+avg[i]);
			}
		}
		System.out.println("\nStudent getting average less than 80-----> ");
		for(int i=0;i<n;i++)
			{
				if(avg[i]<80)
				{
				System.out.println("\nRoll no - "+Rollno[i]);
				System.out.println("Average marks - "+avg[i]);
				}
			}
		}
	}