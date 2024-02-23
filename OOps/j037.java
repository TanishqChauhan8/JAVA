import java.util.Scanner;

class j037
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		char ch;
		System.out.print("Enter the  Character - ");
		ch=sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			System.out.print("Vowel");
		else
			System.out.print("Consonant");
	}
	
}