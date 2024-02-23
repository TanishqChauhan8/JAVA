import java.util.Scanner;

class j067
{
	public static void main(String ar[])
	{
	String s="";
	System.out.print("Enter the word : ");
	Scanner sc=new Scanner (System.in);
	s=sc.nextLine();
	int k=0;
	for(int i=0;i<s.length();i++)
	{
		int j=k;
		while(j<s.length())
		{
			System.out.print(s.charAt(j)+" ");
			j++;
		}
		System.out.println();
		k++;
	}
	}
}