import java.util.Scanner;
class j038
{
	public static void main(String ar[])
	{
		String s;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the String : ");
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
			System.out.print(s.charAt(i));
	}
}