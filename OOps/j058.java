import java.util.Scanner;

class j058
{
	int HappyNumber(int num)
	{
		int sum=0;
		do{
			while(num>0)
			{
				int r=num%10;
				sum=sum+(r*r);
				num/=10;
			}
			num=sum;
			sum=0;
		}while(num>9);
		
		return num;
	}
	
	int NumberWord(String s)
	{
		String m="";
		int sum;
		
		for(int i=0;i<s.length();i++)
			m=m+String.valueOf(s.charAt(i)-64);
		
		sum=Integer.parseInt(m);
		
		return sum;
	}
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		String s="",m="";
		System.out.print("Enter the String : ");
		s=sc.nextLine();
		s=s.toUpperCase();
		
		j058 ob = new j058();
		int num=ob.NumberWord(s);
		int k=ob.HappyNumber(num);
		if(k==1)
			System.out.println("Number is HappyNumber ");
		else 
			System.out.println("Number is not Happy Number ");
	}
}