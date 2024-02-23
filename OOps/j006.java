import java.util.Scanner;

class j006
{
	public static void main(String ar[])
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year : ");
		year=sc.nextInt();
		if(year%4==0 && year%100!=0)
			System.out.println("Its a leapyear");
		else if(year%400==0 && year%100==0)
			System.out.println("Its a century leap year");
		else if(year%400!=0 && year%100==0)
			System.out.println("Its  a century year but not a leap year");
		else
			System.out.println("Its not a leap year and not a century year");
	}
}