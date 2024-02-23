import java.util.Scanner;

class j070
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		String s="";
		System.out.print("Enter the String : ");
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			int k=0;
			while(k<=i)
			{
				System.out.print(s.charAt(k)+" ");
				k++;
			}
			System.out.println();
		}
	}
}