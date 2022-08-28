package Queue;

import java.util.Stack;

public class QUsingS {
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	void enqueue(int item)
	{
		s1.push(item);
	}
	int front()
	{
		if(!s2.isEmpty())
			return s2.peek();
		else 
			return -1;
			
	}
	int last()
	{
		if(!s1.isEmpty())
			return s1.peek();
		else 
			return -1;
	}
	int dequeue()
	{
		if(s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QUsingS q = new QUsingS();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		
		q.dequeue();
		q.dequeue();
		
		q.enqueue(50);
		System.out.println("front :"+q.front()+" last: "+q.last());

	}

}
