import java.util.*;

class ABC extends Thread
{
	public void run()
	{
		int count1=0,count2=0;
		for(int k=1;k<=24;k++)
		{
			for(int j=0;j<60;j++)
			{
				for(int i=0;i<60;i++)
				{
					if(count2>0)
					System.out.println(k+" hr "+j+" min "+i+" sec ");
					
					
					else if(count1>0)
					System.out.println(j+" min "+i+" sec ");
				
					else
					System.out.println(i+" sec");
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e){};
				}
					count1++;
			}
			count2++;
		}
				
	}
	
	
	public static void main(String ar[])
	{
		ABC ob=new ABC();
		ob.start();
	}
}