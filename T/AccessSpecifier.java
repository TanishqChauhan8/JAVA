package T;

public class AccessSpecifier
{
	private void privateFun()
	{
		System.out.println("Private Function ");
	}
		
	public void publicFun()
	{
		privateFun();
	    System.out.println("Public function ");
	}
	
	protected void protectedFun()
	{
		System.out.println("Protected Function ");
	}
}