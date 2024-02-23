import java.util.*;

class ABC{
	
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the binary Number : ");
		n=sc.nextInt();
		StringBuffer str=new StringBuffer();
		str.append(n);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0')
				str.replace(i,i+1,"1");
		}
		
		
		System.out.print(str);
	}
}