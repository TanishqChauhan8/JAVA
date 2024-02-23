import T.*;

class calculate extends AccessSpecifier
{
	public static void main(String ar[])
	{
		AccessSpecifier ob=new AccessSpecifier();
		/* ob.privateFun(); // error: privateFun() has private access in AccessSpecifier
		ob.publicFun();
		ob.protectedFun(); //error: protectedFun() has protected access in AccessSpecifier
		*/
		calculate ob1=new calculate();
		ob1.publicFun();
		ob1.protectedFun();
		System.out.println("Values Recieved Command Line Argument : "+ar[0]+" "+ar[1]); 
	}
}