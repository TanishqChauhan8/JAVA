import java.util.Scanner;

class j065
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s="";
		System.out.print("Enter the word : ");
		s=sc.nextLine();
		int l=1,j=0;
		for(int i=0;i<s.length();i++)
		{
		while(j<l)
		{
		System.out.print(s.charAt(j)+" ");
		j++;
		}
		System.out.println();
		j=0;
		l++;
		}
	}
}