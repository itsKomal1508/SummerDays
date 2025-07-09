import java.util.Stack;
class PushAtBottom{
	public static void pushAtBottom(Stack<Integer> stack, int data)
	{
		if(stack.isEmpty())
		{
			stack.push(data);
			return;
		}
		int top=stack.pop();
		pushAtBottom(stack,data);
		stack.push(top);
	}
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		pushAtBottom(s,5);
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
	}
}