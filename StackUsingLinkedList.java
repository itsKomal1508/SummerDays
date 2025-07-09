class StackUsingLinkedList
{
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	static class Stack{
		static Node head=null;
		public static boolean isEmpty()
		{
			return head==null;
		}
		//push
		public static void push(int data)
		{
			Node newNode=new Node(data);
			if(isEmpty())
			{
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
		}
		//pop
		public static int pop()
		{
			if(isEmpty())
			{
				return -1;
			}
			int top=head.data;
			head=head.next;
			return top;
		}
		//peek
		public static int peek()
		{
			if(isEmpty())
			{
				return -1;
			}
			return head.data;
		}
		//display
		public static void display()
		{
			if(isEmpty())
			{
				return;
			}
			Node temp=head;
			System.out.println("**************Elements of elements***************");
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.display();
		/*while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}*/
	}
}