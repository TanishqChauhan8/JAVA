import java.util.Scanner;

class Amount
{
	int acno;
	float balance;
	
	void input(int a,int b)
	{
		acno=a;
		balance=b;
	}
	
	void withdrawl(int w)
	{
		balance=balance-w;
	}
	
	void deposit(int d)
	{
		balance = balance +d;
	}
}

class Calculate extends Amount
{
	int r,t;
	float si,amt;
	
	void accept(int x,int y)
	{
		r=x;
		t=y;
		amt=0;
	}

void compute()
{
	si=(balance*r*t)/100;
	amt=amt+si;
}

void display()
{
	System.out.println("Account Number - "+acno);
	System.out.println("Balance - "+balance);
	System.out.println("Intrest - "+si);
	System.out.println("Amount - "+amt);
}

public static void main(String ar[])
{
	Calculate ob=new Calculate();
	ob.input(1,10000);
	ob.withdrawl(1000);
	ob.deposit(2000);
	ob.accept(2,1);
	ob.compute();
	ob.display();
}
}
	