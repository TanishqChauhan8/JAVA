import java.util.Stack;

class LearnStack
{
	public static void main(String ar[])
	{
		Stack<String> animal=new Stack<>();
		animal.push("Lion");
		animal.push("Cat");
		animal.push("Dog");
		System.out.println("Stack : "+animal);
		System.out.println(animal.peek());
		animal.pop();
		System.out.println("Stack: "+animal);
		for(int i=0;i<animal.size();i++)
		{
			System.out.println("Stack: "+animal.get(i));
		}
	}
}
		