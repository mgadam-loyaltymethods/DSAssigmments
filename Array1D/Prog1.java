package Array1D;

//tc:o(n)
//sc:o(1)
public class Prog1 {
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6,2,8,25,42};
	int l=Integer.MIN_VALUE,s=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>l)
		{
			l=arr[i];
		}
		
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==l)
			continue;
			if(arr[i]>s)
			{
				s=arr[i];
			}
	}
	System.out.println("second largest: "+s);
 }
}
