package Array1D;
//tc:o(n)
//sc:o(1)
public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,0,1,0,1,0,1,0,1,0,1,0,1};
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
			c++;
		}
		for(int i=0;i<c;i++)
			arr[i] = 0;
		for(int i=c;i<arr.length;i++)
			arr[i] = 1;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
