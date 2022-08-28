package Queue;

public class QLinkedList {
	int data;
	QLinkedList next,previous,head,tail;
	
	void enqueue(int item)
	{
		if(head==null && tail ==null)
		{
			QLinkedList q1 = new QLinkedList();
			q1.data = item;
			head = q1;
			tail = q1;
		}
		else {
			QLinkedList q1 = new QLinkedList();
			q1.data = item;
			q1.previous = tail;
			tail.next = q1;
			tail = tail.next;
			
		}
	}
	int front()
	{
		return head.data;
	}
	int last()
	{
		return tail.data;
	}
	int dequeue()
	{
		if(head == null)
			return -1;
		else {
			int t = head.data;
			head = head.next;
			head.previous = null;
			return t;
		}
	}
	void printLLFromFront() {
		QLinkedList c = head;
		while(c!=null)
		{
			System.out.println(c.data);
			c=c.next;
		}
	}
	public static void main(String[] args) {
		QLinkedList q = new QLinkedList();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		q.printLLFromFront();
		q.dequeue();
		q.dequeue();
		System.out.println("-------------------------------");
		
		q.printLLFromFront();
		System.out.println("--------------------------------");
		System.out.println("front :"+q.front()+" last: "+q.last());
		

	}

}
