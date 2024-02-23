import java.util.*;

class ABC{

	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the binary Number : ");
		n=sc.nextInt();
		
		String s=String.valueOf(n);
		String a[]=s.split("");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals("0"))
			{
				a[i]="1";
			}
		}
		
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]);
	
	}
}