import java.util.Scanner;

class j055
{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	String s="",w="",s1="Blue";
	System.out.print("Enter the Sentence : ");
	s=sc.nextLine();
	s=s+" ";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
			w=w+s.charAt(i);
		else
		{
			if(w.equals(s1))
				System.out.print("Red ");
			else
				System.out.print(w+" ");
			
			w="";
		}
	}
	}
}