package StackAssignment;

//Assigmnent 1,3
public class StackUsingArray {
	int stack[] = new int[1];
	int li = -1;
	void push(int item)
	{
		if(li+1 == stack.length)
		{
			int newArr[] = new int[stack.length*2]; 
			for(int i=0;i<stack.length;i++)
			{
				newArr[i] =  stack[i];
			}
			stack=newArr;
		}
		li++;
		stack[li] = item;
	}
	int pop()
	{
		int val = stack[li];
		stack[li] = -1;
		li--;
		return val;
	}
	int peek()
	{
		return stack[li];
	}
	//print from bottom to top
	 void PrintStackFromBottom(StackUsingArray s)
	{
	   
	    if (li == -1)
	        return;
	     
	    int x = s.peek();
	 
	    
	    s.pop();
	 
	    
	    PrintStackFromBottom(s);
	 
	 
	    System.out.print(x + " ");
	 
	    
	    s.push(x);
	}
	void printStack()
	{
		int current = li;
		for(int i=current;i>=0;i--)
		{
			System.out.print(stack[i]+" ");
		}
	}
	void reverseStack()
	{
		int limit = li;
		StackUsingArray rs = new StackUsingArray();
		for(int i=limit;i>=0;i--)
		{
			rs.push(stack[i]);
		}
		
		System.out.println("data from bottom");
		rs.PrintStackFromBottom(rs);
		System.out.println();
		System.out.println("------------");
		System.out.println("data from top");
		rs.printStack();
		System.out.println();
		System.out.println("------------");
	}
	public static void main(String[] args) {
		
		StackUsingArray s = new StackUsingArray();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("data after push");
		System.out.println("data from bottom");
		s.PrintStackFromBottom(s);
		System.out.println();
		System.out.println("------------");
		System.out.println("data from top");
		s.printStack();
		System.out.println();
		System.out.println("------------");
		
		System.out.println("reversed stack data");
		s.reverseStack();
		s.pop();
		s.pop();
		System.out.println("data after pop");
		System.out.println("data from bottom");
		s.PrintStackFromBottom(s);
		System.out.println();
		System.out.println("------------");
		System.out.println("data from top");
		s.printStack();
		System.out.println();
		System.out.println("------------");
		
		
		
	}

}
