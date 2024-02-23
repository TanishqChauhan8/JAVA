import java.util.Scanner;

class j060
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s="";
		System.out.print("Enter the String : ");
		s=sc.nextLine();
		String str=s.toUpperCase();
		str=str.trim();
		int d=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
				d++;
		}
		System.out.print("Number of double letter Sequence - "+d);
	}
}