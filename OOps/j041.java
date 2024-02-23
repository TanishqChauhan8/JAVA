import java.util.Scanner;
class j041
{
	public static void  main(String ar[])
	{
		String w;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Word - ");
		w=sc.nextLine();
		System.out.print(w.charAt(0));
		for(int i=1;i<w.length();i++)
			{
				if(w.charAt(i)==' ')
					System.out.print(" "+w.charAt(i+1));
			}
	}
}	