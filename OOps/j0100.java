import java.util.Scanner;

abstract class Account
{
	int acno;
	float balance;
	void account(int a,int b)
	{
		acno=a;
		balance=b;
	}
	abstract void deposit(int d);
	abstract void withdraw(int w);
}

class Calculate extends Account
{
	int r,t;
	float si,amt;
	void accept(int x,int y)
	{
		r=x;
		t=y;
		amt=0;
	}
	void deposit(int d)
	{
		balance+=d;
	}
	void withdraw(int w)
	{
		balance-=w;
	}
	void compute()
	{
		si=(balance*r*t)/100;
		amt=amt+si;
	}
	void display()
	{
		System.out.print("Account No- "+acno+"\nBalance - "+balance+"\nInterest - "+si+"\nAmount - "+amt);
	}
	public static void main(String ar[])
	{
		Calculate ob=new Calculate();
		ob.account(12345,100);
		ob.accept(2,10);
		ob.deposit(1000);
		ob.withdraw(1);
		ob.compute();
		ob.display();
	}
}
	