import java.util.Scanner;

class  j076
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		int n,count=1;
		System.out.print("Enter the Number of Cities ");
		n=sc.nextInt();
		String s[]=new String[n];
		String std[]=new String[n];
		String a="";
		sc=new Scanner (System.in);
		for(int i=0;i<s.length;i++)
		{
			System.out.print("Enter Country Name : ");
			s[i]=sc.nextLine();
			System.out.print("Enter the STD Code : ");
			std[i]=sc.nextLine();
		}
		System.out.print("Enter the Country Name to Search : ");
		a=sc.nextLine();
		for(int i=0;i<s.length;i++)
		{
			String k="";
			k=s[i];
			if(a.equals(k))
			{
				System.out.println("Search Successful");
				System.out.print(s[i]+" - "+std[i]);
			}
			else
			count++;
		}
		if(count==s.length)
			System.out.print("Search Unsuccessful ,no Such City in the list");
	}
}