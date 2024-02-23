import java.util.Scanner;

class gdp
{
	int y;
	float g;
	gdp()
	{
		y=2019;
		g=202;
	}
	
    gdp(gdp x)
	{
		for(int i=0;i<5;i++)
		{
		System.out.println((x.y)+" - "+(x.g));
		x.g=x.g+((x.g*5)/100);
		x.y=x.y+1;
		}
	}
	
	
	public static void main(String ar[])
	{
		gdp ob=new gdp();
		gdp ob1=new gdp(ob);
	}
}