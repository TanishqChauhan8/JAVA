import java.util.*;

class ABC
{
	public synchronized int deposit(int balance)
	{
		int amount=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try
			{
				if(i==5)
				{
				 return balance;
				 wait();
				}
				
				System.out.print("Enter the Amount to deposit : ");
				amount=sc.nextInt();
				balance=balance+amount;
				Thread.sleep(1000);
				
			}catch(InterruptedException e){};
		}		
	}

	public synchronized void withdraw(int balance)
	{
		int amount=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.print(Thread.currentThread().getName()+" "+i);
			try
			{
				System.out.print("Enter the Amount to withdraw : ");
				amount=sc.nextInt();
				balance=balance-amount;
				Thread.sleep(1000);
			}catch(InterruptedException e){};
		}
		notify();	
	}
	
	class Thread1 extends Thread{
		ABC ob1;
		
		Thread1(ABC x)
		{
			ob1=x;
		}
		
		public void run()
		{
		int balance=ob1.deposit(1000);
		}
	}
	
	class Thread2 extends Thread1,Thread{
		ABC ob2;
		
		Thread2(ABC x)
		{
			ob2=x;
		}
		
		public void run()
		{
		balance=ob2.withdraw(balance);
		}
	}
}


class Interthread
{
	public static void main(String args[])
	{
		ABC ob=new ABC();
		Thread t1=new Thread();
		Thread t2=new Thread();
		t1.start();
		t2.start();
	}
}
