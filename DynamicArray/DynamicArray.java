package DynamicArray;

public class DynamicArray {
	int arr[] = new int[1];
	int li = 0;
	void add(int item)
	{
		if(li == arr.length)
		{
			int newArr[] = new int[arr.length*2]; 
			for(int i=0;i<arr.length;i++)
			{
				newArr[i] =  arr[i];
			}
			arr=newArr;
		}
		arr[li] = item;
		li++;
	}
	void removeItem()
	{
		arr[li]=-1;
		li--;
	}
	void insertAt(int index,int value)
	{
		if(li == arr.length)
		{
			int newArr[] = new int[arr.length*2]; 
			for(int i=0;i<arr.length;i++)
			{
				newArr[i] =  arr[i];
			}
			arr=newArr;
		}
		for(int i=li;i>=index;i--)
		{
			arr[i+1] = arr[i];
		}
		arr[index] = value;
		li++;
	}
	
	void removeAt(int index)
	{
		for(int i=index;i<=li;i++)
		{
			arr[i] = arr[i+1];
		}
		li--;
		
	}
	void getSize()
	{
		System.out.println("size"+li);
	}
	void getCapacity()
	{
		System.out.println("capacity"+arr.length);
	}
	int getElementAt(int index)
	{
		return arr[index];
	}
	boolean GetElement(int value)
	{
		for(int i=0;i<li;i++)
		{
			if(arr[i]== value)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray d = new DynamicArray();
		d.add(10);
		d.add(20);
		d.insertAt(1, 30);
		System.out.println("element at given position: "+d.getElementAt(1));
		System.out.println("element status:"+d.GetElement(30));
		d.getSize();
		d.getCapacity();
		System.out.println("final array is");
		for(int i=0;i<d.li;i++)
		{
			System.out.println(d.arr[i]);
		}
		
	}

}
