import java.util.Scanner;

class j030
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.print("Enter the Number of Student : ");
		int n=sc.nextInt();
		System.out.print("Enter the Number of Subject : ");
		int s=sc.nextInt();
		sc.nextLine();
		int marks[][]=new int[n][s];
		String name[]=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the Name of Student "+(i+1)+" : ");
			name[i]=sc.nextLine();
			for(int j=0;j<s;j++)
			{
				System.out.print("Enter the Marks in sub "+(j+1)+" : ");
				marks[i][j]=sc.nextInt();
				sc.nextLine();
			}
		}
		System.out.print("Enter the Name of the Student whose detail u want to fetch : ");
		String search=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			if(search.equals(name[i]))
			{
				System.out.println("Name ---> "+name[i]);
				for(int j=0;j<s;j++)
				{
					System.out.println("Marks in sub "+(j+1)+" ---> "+marks[i][j]);
					c=1;
				}
			}
		}
		if(c!=1)
			System.out.println("Student Data does not exists ");
	}
}