package Queue;

public class QArray {
	int arr[] = new int[1];
	int ei=-1,i;
	void enqueue(int item)
	{
		if(ei == arr.length-1)
		{
			int newArr[] = new int[arr.length*2]; 
			for(int i=0;i<arr.length;i++)
			{
				newArr[i] =  arr[i];
			}
			arr=newArr;
		}
		ei++;
		arr[ei] = item;
		
	}
	int front()
	{
		return arr[0];
	}
	int last()
	{
		return arr[ei];
	}
	int dequeue()
	{
		if(ei == -1)
		return -1;
		else {
			int t = arr[0];
			for(i=0;i<ei;i++)
			{
				arr[i] = arr[i+1];
			}
			
			arr[i] = -1;
			ei--;
			return t;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QArray q = new QArray();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		for(int i=0;i<=q.ei;i++)
		{
			System.out.println(q.arr[i]);
		}
		
		q.dequeue();
		q.dequeue();
		System.out.println("-------------------------------");
		
		for(int i=0;i<=q.ei;i++)
		{
			System.out.println(q.arr[i]);
		}
		System.out.println("--------------------------------");
		System.out.println("front :"+q.front()+" last: "+q.last());
		
	}

}
