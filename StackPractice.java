import java.util.ArrayList;
class StackPractice{
	static class Stack{
		static ArrayList<Integer> list=new ArrayList<>();
		
		public static boolean isEmpty()
		{
			return list.size()==0;
		}
		
		//push
		public static void push(int data)
		{
			list.add(data);
		}
		//pop
		public static int pop()
		{
			if(isEmpty())
			{
				return -1;
			}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		//peek
		public static int peek()
		{
			if(isEmpty())
			{
				return -1;
			}
			return list.get(list.size()-1);
		}
		/*//display
		public static void display()
		{
			for(int i=list.size()-1;i>=0;i--)
			{
					System.out.println(list.get(i));
			}
		}*/
	}
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		//s.display();
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
	}
}