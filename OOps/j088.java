import java.util.Scanner;

class Number
{
	int n;
	void accept()
	{
		n=11;
	}
	void display()
	{
		System.out.println(n);
	}
}

class Check extends Number
{
	int fact,revnum;
	void find()
	{
		fact=1;
		int temp=n;
		while(temp!=1)
		{
		fact=fact*temp;
		temp--;
		}
		System.out.println("Factorial of "+n+" - "+fact);
	}
	
	void palindrome()
	{
		int temp=n;
		while(temp!=0)
		{
			revnum=revnum*10+temp%10;
			temp=temp/10;
		}
		
		if(revnum==n)
		{
		  System.out.println(" "+n+" is an palindrome number ");
		}
	}
	
	public static void main(String ar[])
	{
		Check ob=new Check();
		ob.accept();
		ob.display();
		ob.find();
		ob.palindrome();
	}
};