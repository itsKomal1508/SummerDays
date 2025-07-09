import java.util.*;
class ReverseStack{
	public static void reverseStack(Stack<Integer> s)
	{
		if(s.isEmpty())
		{
			return;
		}
		int top=s.pop();
		reverseStack(s);
		pushAtBottom(s,top);
	}
	public static void pushAtBottom(Stack<Integer> s,int data)
	{
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		int top=s.pop();
		pushAtBottom(s,data);
		s.push(top);
	}
	public static void printStack(Stack<Integer> s)
	{
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		printStack(s);
		System.out.println("**********************************************");
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		reverseStack(s);
		printStack(s);
	}
}