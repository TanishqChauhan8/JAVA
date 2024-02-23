import java.util.Scanner;

class j014
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n,max1=0,max2=0,avg1=0,avg2=0,total1=0,total2=0;
		
		System.out.println("Enter the Number of Student: ");
		n=sc.nextInt();
		
		int marks[]=new int[n];
		int marks2[]=new int[n];
		
		String mname="";
		String kname="";
		String name[]=new String[n];
		System.out.println("Enter the Name of the Student: ");
		sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			name[i]=sc.nextLine();
		}
		sc=new Scanner(System.in);
		
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter the Marks of the Student in physics 100: ");
			marks[i]=sc.nextInt();
		    total1=total1+marks[i];
			System.out.println("\nEnter the Marks of the Student in Chemistry 100: ");
			marks2[i]=sc.nextInt();
			total2=total2+marks2[i];
			
			if(max2<marks2[i])
			{
				max2=marks2[i];
				mname=name[i];
			}
			if(max1<marks[i])
			{
				max1=marks[i];
				kname=name[i];
			}
		}
		avg1=total1/n;
		System.out.println("The Average marks in physics is "+avg1);
		avg2=total2/n;
		System.out.println("The Average marks in Chemistry is "+avg2);
		System.out.println("The Highest marks in physics is "+max1);
		System.out.println("Student getting highest marks in physics "+mname);
		System.out.println("Student getting highets marks in Chemistry "+kname);
	}
}
		
			
		
		