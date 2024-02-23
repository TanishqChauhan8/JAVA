class ABC 
{
    public synchronized void count1() 
	{
        for (int i = 1; i <= 10; i++) 
		{
            System.out.println(Thread.currentThread().getName() + "  " + i);
            try 
			{
				if(i==5)
				 wait();
				
                Thread.sleep(1000);
            } 
			catch (InterruptedException e) {}
        }
    }
	
	
	public synchronized void count2() 
	{
		
        for (int i = 1; i <= 5; i++) 
		{
            System.out.println(Thread.currentThread().getName() + "  " + i);
            try 
			{
                Thread.sleep(1000);
            } 
			catch (InterruptedException e) {}
        }
		notify();	
    }
}

 class Thread1 extends Thread {
    ABC ob;

    Thread1(ABC x) 
	{	
        ob = x;
    }

    public void run() 
	{
        ob.count1();
    }
}

class Thread2 extends Thread {
    ABC ob;

    Thread2(ABC x) 
	{
        ob = x;
    }

    public void run() {
        ob.count2();
    }
}
	
class inter_thread 
{
    public static void main(String[] args) 
	{
        ABC ob = new ABC();
        Thread1 t1 = new Thread1(ob);
        Thread2 t2 = new Thread2(ob);
        t1.start();
        t2.start();
    }
}
