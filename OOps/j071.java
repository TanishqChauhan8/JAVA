import java.util.Scanner;

class j071
{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner (System.in);
	int n;
	System.out.print("Enter the number of country : ");
	n=sc.nextInt();
	String country[]=new String[n];
	String capital[]=new String[n];
	sc=new Scanner (System.in);
	for(int i=0;i<n;i++)
	{	
	System.out.print("Enter the Country Name : ");
	country[i]=sc.nextLine();
	System.out.print("Enter the Capital of the country : ");
	capital[i]=sc.nextLine();
	}
	
	for(int i=0;i<n;i++)
	{
		if(country[i].charAt(0)=='A' || country[i].charAt(0)=='E' ||country[i].charAt(0)=='I' ||country[i].charAt(0)=='O' ||country[i].charAt(0)=='U')
			System.out.println(country[i]+" - "+capital[i]);
	}
	}
}	