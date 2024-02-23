import java.util.Scanner;

class j068
{
	public static void main(String ar[])
	{
	String s="";
	System.out.print("Enter the word : ");
	Scanner sc=new Scanner (System.in);
	s=sc.nextLine();
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		int j=0;
		while(j<=count)
		{
		System.out.print(s.charAt(i)+" ");
		j++;
		}
		count++;
		System.out.println();
	}
	}
}