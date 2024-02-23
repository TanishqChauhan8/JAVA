import java.util.*;

class main
{
	public static void main(String ar[])
	{
	Stack<Character> stack=new Stack<>();
	stack.push('A');
	stack.push('B');
	stack.push('C');
	stack.remove(1);
	stack.add(1,'D');
	System.out.println(stack);
	stack.pop();
	System.out.println(stack.size());
	System.out.println(stack);
	}
}
	
	
	