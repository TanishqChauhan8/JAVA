import java.util.Scanner;

class j042
{
	public static void main(String ar[])
	{
		String s,w1,w2,w3;
		int w=0;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the 3 words Name - ");
		s=sc.nextLine();
		for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
				{
					w++;
					if(w!=1)
					  w1.charAt(i)=s.charAt(i);
					else if(w!=2)
						w2.charAt(i)=s.charAt(i);
					else
						w3.charAt(i)=s.charAt(i);	
				}
			}
			System.out.print(w3+""+w1+""+w1);
	}
}