import java.util.*;

class main
{
	public static void main(String ar[])
	{
	Stack<String> tan=new Stack<>();
	tan.push("Yummy");
	tan.push("enni");
	tan.push("minni");
	System.out.println(tan);
	System.out.println(tan.peek());
	tan.remove("Yummy");
	tan.add(1,"Tanishq");
	System.out.println(tan);
	}
}