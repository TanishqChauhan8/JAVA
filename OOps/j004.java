import java.util.Scanner;

class j004
{
	public static void main(String ar[])
	{
		int A,B,C;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three Numbers : ");
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		if(A==B && B==C)
			System.out.println("All the Three numbers are equal");
		else
		{
			if(A>B && A>C)
				System.out.println(A+" is the Greatest nummber");
			else if(B>A && B>C)
				System.out.println(B+" is the Greatest number");
			else
				System.out.println(C+" is the Greatest number");
		}	
			
	}
}	