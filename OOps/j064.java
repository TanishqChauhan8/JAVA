import java.util.Scanner;

class j064
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s=sc.nextLine();
		int len=s.length();
		int j=0;
		for(int i=0;i<s.length();i++)
		{
		while(j!=len)
		{
		 System.out.print(s.charAt(j)+" ");
		 j++;
		}
		System.out.println();
		len--;
		j=0;
		}
	}
}