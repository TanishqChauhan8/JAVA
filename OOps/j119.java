	import java.util.Scanner;

	class XYZ
	{
		char ch;
		String str;
		Scanner sc=new Scanner(System.in);
		
		void display()
		{
			System.out.println("Enter the Character : ");
			ch=sc.next().charAt(0);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String : ");
			str=sc.nextLine();
			int l=str.length()-1;
			if(str.charAt(0)==ch && str.charAt(l)==ch)
			System.out.println("Special Word");
			
			else
			System.out.println("Not a special word");
		}
	}

	class ABC extends XYZ 
	{
		String str1="",str2="";
	
		void display()
		{
		super.display();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word u want to check : ");
		str1=sc.nextLine();
		System.out.println("Enter the Word u want to check : ");
		str2=sc.nextLine();
		if(str1.equals(str2))
		System.out.println("Both the Strings are Equal");
		else
		System.out.println("Both string are unequal ");
		}
	}

	class PQR extends ABC
	{
		int n;
		String str="";
	
		void display()
		{
			super.display();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String : ");
			str=sc.nextLine();
			System.out.println("Enter the position : ");
			n=sc.nextInt();
			System.out.printf("Character at %c",str.charAt(n));
		}
		
		public static void main(String ar[])
		{
			PQR ob=new PQR();
			ob.display();
		}
	}
			
		