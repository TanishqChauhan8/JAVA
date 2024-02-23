import java.util.Scanner;

class j074
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter the Number of city : ");
		n=sc.nextInt();
		String city[]=new String[n];
		sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
		System.out.print("Enter the Name of the city : ");
		city[i]=sc.nextLine();
		}
		
		for(int i=0;i<n;i++)
		{
			char ch=Character.toUpperCase(city[i].charAt(0));
			
			if(ch!='A' ||ch!='E' ||ch!='I' ||ch!='O' ||ch!='U')
			{
				int p=city[i].length()-1;
				 ch=Character.toUpperCase(city[i].charAt(p));
			if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
				{
					System.out.println(city[i]);
				}
			}
		}
	}
}