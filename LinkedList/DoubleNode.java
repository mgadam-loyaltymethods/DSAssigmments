package LinkedList;

public class DoubleNode {
	int val;
	DoubleNode prev;
	DoubleNode next,head,tail;
	public void insert(int i)
	{
		if(head == null && tail == null )
		{
			DoubleNode n1 = new DoubleNode();
			n1.val = i;
			head = n1;
			tail = n1;
		}
		else {
			DoubleNode n2 = new DoubleNode();
			n2.val = i;
			n2.prev = tail;
			tail.next = n2;
			tail = n2;
		}
	}
	public void printLL()
	{
		DoubleNode current = head;
		while(current != null)
		{
			System.out.println(current.val);
			current = current.next;
		}
		
	}
	public void printLLFromBack()
	{
		DoubleNode current = tail;
		while(current != null)
		{
			System.out.println(current.val);
			current = current.prev;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleNode n2 = new DoubleNode();
		n2.insert(10);
		n2.insert(20);
		n2.insert(30);
		n2.insert(40);
		System.out.println("print from start");
		n2.printLL();
		System.out.println("print from end");
		n2.printLLFromBack();
	}

}
