	class ABC
	{
		int a,b;
		void input()
		{
			a=10;
			b=20;
		}
	}
	
	class XYZ extends ABC
	{
		int c=0;
		void cal()
		{
		c=a+b;
		}
	}
	class PQR extends XYZ
	{
		int d=0;
		void display()
		{
			d=c+a+b;
			System.out.print(d);
		}
		
		public static void main(String ar[])
		{
			PQR ob=new PQR();
			ob.input();
			ob.cal();
			ob.display();
		}
	}