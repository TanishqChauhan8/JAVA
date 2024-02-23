import java.util.Scanner;

class j016
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int marks1[]=new int[2];
		int marks2[]=new int[2];
		int marks3[]=new int[2];
		int sum1=0;
		int sum2=0;
		int avg_english=0;
		int avg_maths=0;
		int avg_science=0;
		int avgst;
		for(int i=0;i<2;i++)
		{
			System.out.println("Marks of student "+(i+1)+" :");
			System.out.println("Enter the marks in English:");
			marks1[i]=sc.nextInt();
			System.out.println("Enter the marks in Maths:");
			marks2[i]=sc.nextInt();
			System.out.println("Enter the marks in Science:");
			marks3[i]=sc.nextInt();
		}
		for(int i=0;i<2;i++)
		{
			sum1=marks1[i]+marks2[i]+marks3[i];
			avgst=sum1/3;
			System.out.println("Average of Student "+(i+1)+" is "+avgst);
			
			avg_english+=marks1[i];
			avg_maths+=marks2[i];
			avg_science+=marks3[i];
		}
		avg_science/=2;
		avg_english/=2;
		avg_maths/=2;
		System.out.println("Average of English is "+avg_english);
		System.out.println("Average of Mathematics is "+avg_maths);
		System.out.println("Average of Science is "+avg_science);
	}
}
		
		