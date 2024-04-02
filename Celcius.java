import java.util.*;

abstract class Temp{
	double temp;
	void setTempData(double t)
	{
		temp=t;
	}
	
   abstract void changeTemp();
}


class Fahernheit extends Temp{
	double ctemp;
	public void changeTemp()
	{
		ctemp=(5.0/9.0)*(temp-32);
		System.out.printf("%.1f",ctemp);
	}
}

class Celcius extends Temp{

	double ftemp;
	public void changeTemp()
	{
		ftemp=(9.0/5.0)*(temp+32);
		System.out.printf("%.1f",ftemp);
	}
	
	public static void main(String args[])
	{
		Celcius ob=new Celcius();
		ob.setTempData(10.0d);
		ob.changeTemp();
		Fahernheit ob1=new Fahernheit();
		ob1.setTempData(100.0d);
		ob1.changeTemp();
	}
}
