package StackAssignment;

public class BalancedStack {

	char data;
	BalancedStack head, tail,next,previous;
	void push(char val)
	{
		if(head == null && tail == null)
		{
			BalancedStack s1 = new BalancedStack();
			s1.data = val;
			tail = s1;
			head = s1;
		}
		else {
			BalancedStack s2 = new BalancedStack();
			s2.data = val;
			s2.previous = tail;
			tail.next = s2;
			tail = tail.next;
			
		}
	}
	char pop()
	{
		
			char val = tail.data;
			tail = tail.previous;
			if(tail != null)
			{
			tail.next = null;
			}
			if(tail == null)
				head = null;
			return val;
		
		
	}
	public void printStack()
	{
		BalancedStack current = tail;
		while(current != null)
		{
			System.out.print(current.data+" ");
			current = current.previous;
		}
		
	}
	
	public void printStackFromBottom()
	{
		BalancedStack current = head;
		while(current != null)
		{
			System.out.print(current.data +" ");
			current = current.next;
		}
		
	}
	public char peek()
	{
		if(tail != null)
		return tail.data;
		return ' ';
	}
	boolean isBalanced(String s)
	{
		BalancedStack b1 = new BalancedStack();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == '('||s.charAt(i) == '{'||s.charAt(i) == '[')
				b1.push(s.charAt(i));
			else if(s.charAt(i) == ')'&& b1.peek() == '('||s.charAt(i) == '}'&& b1.peek() == '{'||s.charAt(i) == ']'&& b1.peek() == '[')
				b1.pop();
			else
				return false;
			
		}
		if(b1.head == null && b1.tail == null)
		{
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "{[]()}";
		
		BalancedStack b1 = new BalancedStack();
		
		System.out.println("given string is balanced or not: "+b1.isBalanced(s));
		

	}

}
