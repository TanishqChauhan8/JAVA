class main
{
	int a;
	main add(main ob)
	{
		ob.a+=10;
		return ob;
	}
	
	main multiply(main ob)
	{
		ob.a*=10;
		return ob;
	}
	
	public static void main(String ar[])
	{
		main ob=new main();
		ob.a=10;
		ob=ob.add(ob).multiply(ob);
		System.out.println("multiply = "+ob.a);
		
	}
}