import java.util.Scanner;

class j007
{
	public static void main(String[] ar)
	{
		int n1,n2,c1=0,c2=0;
		System.out.println("Enter the two Numbers : ");
		Scanner sc=	new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			if((i*i)==n1)
				System.out.println(n1+" is an perfect number");
			else
			 c1++;
		}
		if(c1==n1)
		   System.out.println(n1+" is not an perfect number");
	      
		for(int i=0;i<n2;i++)
		{
			if((i*i)==n2)
				System.out.println(n2+" is an perfect number");
			else
			 c2++;
	    }
		if(c2==n2)
		   System.out.println(n1+" is not an perfect number");

		if(n1<0)
			System.out.println(n1+" is a negative number Square root of negative number cann't be determined");
		
		if(n2<0)
			System.out.println(n2+" is a negative number Square root of negative number cann't be determined");
	}
}