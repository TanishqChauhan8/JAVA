import java.util.Scanner;

class j034
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		char l;
		System.out.print("Enter the letter : ");
		l=sc.next().charAt(0);
		if(Character.isUpperCase(l))
		{
			System.out.println("Character is Uppercase");
			l=Character.toLowerCase(l);
			System.out.print("Character in Lowercase ---> ");
			System.out.print(l);
		}
		else
		{
			System.out.println("Character is Lowercase");
			l=Character.toUpperCase(l);
			System.out.print("Character in Uppercase ---> ");
			System.out.print(l);
		}
	}
}