import java.util.*;

class main
{
	public static void main(String ar[])
	{
	Stack<Integer> stack=new Stack<>();
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.remove(1);
	stack.add(1,4);
	System.out.println(stack);
	stack.pop();
	stack.set(1,7);
	System.out.println(stack);
	}
}
	
	
	