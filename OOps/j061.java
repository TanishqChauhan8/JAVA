import java.util.Scanner;

class j061
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		String s="",m="";
		System.out.print("Enter the Word: ");
		s=sc.nextLine();
		s=s.trim();
		StringBuffer str=s.toUpperCase();
		for(int i=str.length()-1;i>=0;i--)
			m=m+str.charAt(i);
		if(str.equals(m))
		System.out.print("The word is a pallindrome number ");
		else if(str.charAt(0) == str.charAt(str.length()-1))
		System.out.print("The word is only a Special word");
		else
		System.out.print("The word is neither Pallindrome nor Special word");
	}


}