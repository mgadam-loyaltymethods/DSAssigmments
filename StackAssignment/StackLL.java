package StackAssignment;

import LinkedList.DoubleNode;

public class StackLL {
	int data;
	StackLL head, tail,next,previous;
	void push(int val)
	{
		if(head == null && tail == null)
		{
			StackLL s1 = new StackLL();
			s1.data = val;
			tail = s1;
			head = s1;
		}
		else {
			StackLL s2 = new StackLL();
			s2.data = val;
			s2.previous = tail;
			tail.next = s2;
			tail = tail.next;
			
		}
	}
	int pop()
	{
		int val = tail.data;
		tail = tail.previous;
		tail.next = null;
		return val;
	}
	public void printStack()
	{
		StackLL current = tail;
		while(current != null)
		{
			System.out.print(current.data+" ");
			current = current.previous;
		}
		
	}
	
	public void printStackFromBottom()
	{
		StackLL current = head;
		while(current != null)
		{
			System.out.print(current.data +" ");
			current = current.next;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLL s = new StackLL();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("stack");
		System.out.println("------------");
		s.printStack();
		System.out.println();
		System.out.println("stack from bottom");
		System.out.println("------------");
		s.printStackFromBottom();
		System.out.println();
		System.out.println("------------");
		s.pop();
		s.pop();
		System.out.println("updated stack");
		System.out.println("------------");
		s.printStack();
		System.out.println();
		System.out.println("stack from bottom");
		System.out.println("------------");
		s.printStackFromBottom();

	}

}
