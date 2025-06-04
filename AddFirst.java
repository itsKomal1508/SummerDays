class LinkedList{
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public static Node head;
	public static Node tail;
	public  int size;
	
//Add Node At First
	void addFirst(int data)
	{
		size++;
		Node newNode=new Node(data);
		if(head==null)
		{
			tail=head=newNode;
			return;
		}else{
			newNode.next=head;
			head=newNode;
		}
	}
	void addLast(int data)
	{
		size++;
		Node newNode=new Node(data);
		if(head==null){
			head=tail=newNode;
		}else{
			tail.next=newNode;
			tail=newNode;
		}
	}
//Add in the middle
	void addMiddle(int index,int data)
	{
		if(index==0)
		{
			addFirst(data);
			return;
		}
		size++;
		Node temp=head;
		Node newNode=new Node(data);
			int i=0;
			while(i<index-1)  // 1 2 3 index=1
			{
				temp=temp.next;
				i++;
			}
			newNode.next=temp.next;
			temp.next=newNode;
	}
	
//Remove First Node from the LinkedList
	void removeFirst()
	{
		if(size==0)
		{
			System.out.println("No node is present in the List");
			return;
		}
		if(size==1)
		{
			head=tail=null;
			size=0;
			return;
		}
		int val=head.data;
		head=head.next;
		size--;
		System.out.println(val+"is deleted from the linked list");
	}
//Remove the last node from the linekd list
	void removeLast()
	{
		if(head==null)
		{
			System.out.println("No node is present in the List");
			return;
		}
		if(size==1)
		{
			head=tail=null;
			size=0;
			return;
		}
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		size--;
		int data=temp.next.data;
		System.out.println(data+"is deleted from the Lineked List");
		tail=temp;
		tail.next=null;
	}
//Remove Middle element from the linked List
	void removeMiddle(int index)
	{
		Node temp=head;
			if(size==0)
			{
				System.out.println("LinkedList is empty...!");
				return;
			}
			if(index>size-1)
			{
				System.out.println("index is not present");
				return;
			}
			int i=0;
			while(i<index-1)
			{
				i++;
				temp=temp.next;
			}
			size--;
			int val=temp.next.data;
			temp.next=temp.next.next;
			System.out.println(val+"is deleted from the linkedList");
	}
//Search element by using Iteration Method
	int searchIteratve(int key)
	{
		if(size==0)
		{
			System.out.println("LinkedList is empty...!");
			return 0;
		}
		int index=0;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==key)
			{
				return index;
			}
			index++;
			temp=temp.next;
		}
		return -1;
	}
//Search element using Recursive method
	int searchRecursive(int key)
	{
		return helper(head,key);
	}
	int helper(Node temp,int key)
	{
		if(temp==null)
		{
			return -1;
		}
		if(temp.data==key)
		{
			return 0;
		}
		int idx=helper(temp.next,key);
		if(idx==-1)
		{
			return -1;
		}
		return idx+1;
	}
//Reverse a Linked List 
	void reverse()
	{
		Node prev=null;
		Node current=tail=head;
		Node next;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
//Delete from last Nth Node
	void deleteNthNode(int n)
	{
		if(n>size)
		{
			System.out.println("\nno node present");
			return;
		}
		if(size==n)
		{
			System.out.println("\n"+head.data+"is deleted from the LinkedList");
			head=head.next;
			return;
		}
		int i=1;
		Node temp=head;
		while(i<size-n)
		{
			temp=temp.next;
			i++;
		}
		System.out.println("\n"+temp.next.data+"is deleted from the linkedList");
		temp.next=temp.next.next;
		size--;
	}
//Slow-Fast Approach
	Node findMid(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
//Check weather a LinkedList is palindrome or not
	boolean isPalin()
	{
		if(head==null || head.next==null)
		{
			return true;
		}
		Node mid=findMid(head);
		Node prev=null;
		Node current=mid;
		Node next;
		while(current!=null)
		{
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
		}
		Node right=prev;
		Node left=head;
		while(right!=null)
		{
				if(right.data!=left.data)
				{
					return false;
				}
				left=left.next;
				right=right.next;
		}
		return true;
	}
//Display Node Data
	void display()
	{
		if(size==0)
		{
			System.out.println("LinkedList is empty,..!");
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		//ll.addFirst(10);
		//ll.addFirst(20);
		//ll.addFirst(30);
		//ll.addFirst(40);
		//ll.addFirst(50);
		ll.addLast(100);
		ll.addLast(200);
		ll.addLast(300);
		ll.addLast(200);
		ll.addLast(100);
		//ll.addFirst(00);
		//ll.addMiddle(2,5000);
		//clll.display();
		//System.out.println("\nTotal number of nodes in the LinkedList is:"+ll.size);
		//ll.removeFirst();
		//System.out.println("\nTotal number of nodes in the LinkedList is:"+ll.size);
		//ll.removeLast();
		//ll.display();
		//System.out.println("\nTotal number of nodes in the LinkedList is:"+ll.size);
		//ll.removeMiddle(4);
		//ll.display();
		//System.out.println("\nTotal number of nodes in the LinkedList is:"+ll.size);
		//ll.removeMiddle(5);
		System.out.println("\nTotal number of nodes in the LinkedList is:"+ll.size);	
		//System.out.println("Element 30 is is found at:"+ll.searchIteratve(30));
		//System.out.println("***************Recursive search********************");
		//System.out.println("Element 40 is found at :"+ll.searchRecursive(600));
		//ll.display();
		//System.out.println();
		//ll.reverse();
		//System.out.println();
		//ll.display();
		//ll.deleteNthNode(9);
		ll.display();
		boolean check=ll.isPalin();
		if(check)
		{
			System.out.println("\nLinked List is palindrome");
		}else{
			System.out.println("\nLinked List is not palindrome");
		}
	}
}