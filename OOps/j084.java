import java.util.Scanner;

class gdp
{
	int y;
	float g;
	
	gdp()
	{
	  g=202;
	  y=2019;
	}
	
	gdp(gdp x)
	{
	  g=x.g * 1.05f;
	  y=x.y+1;
	}
	
	void display()
	{
		System.out.println(y+" - "+g);
	}

	public static void main(String ar[])
	{
		gdp ob1=new gdp();
		ob1.display();
		gdp ob2=new gdp(ob1);
		ob2.display();
		gdp ob3=new gdp(ob2);
		ob3.display();
		gdp ob4=new gdp(ob3);
		ob4.display();
		gdp ob5=new gdp(ob4);
		ob5.display();
	}	
}