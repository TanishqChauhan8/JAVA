import java.util.Scanner;

class j033
{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	char ch;
	System.out.print("Enter the Character : ");
	ch=sc.next().charAt(0);
	if(Character.isLetter(ch))
		System.out.println("Character is Letter ");
	else if(Character.isDigit(ch))
		System.out.println("Character is Digit ");
	else
		System.out.println("Character is Special  Charecter ");
	}
}