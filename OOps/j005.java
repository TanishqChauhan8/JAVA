import java.util.Scanner;

class j005
{
	public static void main(String ar[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		num=sc.nextInt();
		if(num%3==0 && num%5==0)
			System.out.println("Number is  divisible by 3 and 5");
		else if(num%3==0 && num%5!=0)
			System.out.println("Number is divisible by 3 not by 5");
		else if(num%3!=0 && num%5==0)
			System.out.println("Number is divisible ny 5 not by 3");
		else
			System.out.println("Number is neither divisible by 3 nor by 5");
	}
}