import java.util.Scanner;
class j039
{
	public static void main(String ar[])
	{
		String s;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Sentence : ");
		s=sc.nextLine();
		int w=1,l=0;
		for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
					w++;
				else
					l++;
			}
			System.out.println("Number of words in sentence - "+w);
			System.out.println("Number of letters in sentence - "+l);
	}
}