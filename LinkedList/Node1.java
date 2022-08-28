package LinkedList;

public class Node1 {
	int i;
	Node1 next;
	Node1 head,tail;
	
	public void insert(int val)
	{
		if(head == null && tail == null )
		{
			Node1 n1 = new Node1();
			n1.i = val;
			head = n1;
			tail = n1;
		}
		else {
			Node1 n1 = new Node1();
			n1.i = val;
			tail.next = n1;
			tail = n1;
		}
	}
	public int middle()
	{
		Node1 m1 =head,m2 = head;
		while(m2 != tail && m2.next !=tail)
		{
			m1 = m1.next;
		
			m2 = m2.next.next;
		}
		return m1.i;
	}
	public void printLL()
	{
		Node1 current = head;
		while(current != null)
		{
			System.out.println(current.i);
			current = current.next;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node1 n2 = new Node1();
		n2.insert(10);
		n2.insert(20);
		n2.insert(30);
		n2.insert(40);
		n2.insert(50);
		n2.printLL();
		System.out.println("-----------------------");
		System.out.println("middle value is:"+n2.middle());

	}

}
