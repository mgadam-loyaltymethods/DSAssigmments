package LinkedList;

public class CircularNode {
	int i;
	CircularNode next;
	CircularNode head,tail;
	
	public void insert(int val)
	{
		if(head == null && tail == null )
		{
			CircularNode n1 = new CircularNode();
			n1.i = val;
			head = n1;
			tail = n1;
		}
		else {
			CircularNode n1 = new CircularNode();
			n1.i = val;
			tail.next = n1;
			tail = n1;
			tail.next = head; 
		}
	}
	
	public void printLL()
	{
		CircularNode current = head;
		do
		{
			System.out.println(current.i);
			current = current.next;
		}while(current != head);
		
	}
	public boolean isCircular() {
		if(head == null)
			return true;
		CircularNode c = head.next;
		while(c != null && c != head)
			c=c.next;
		return(c==head);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularNode n2 = new CircularNode();
		n2.insert(10);
		n2.insert(20);
		n2.insert(30);
		n2.insert(40);
		System.out.println("circular LL values:");
		n2.printLL();
		System.out.println("boolean value for the given linked list is circular or not: "+n2.isCircular());
	}

}
