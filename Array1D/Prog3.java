package Array1D;

//tc:o(n)
//sc:o(l+1)

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,2,2,2,2,3,4,5,1,1,5,2,7};
		
		int l=-100;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>l)
			{
				l=arr[i];
			}
		}
		int freq[] = new int[l+1];
		for(int i=0;i<arr.length;i++)
		{
			freq[arr[i]]++;
		}
		for(int i=0;i<freq.length;i++)
		{
			System.out.println(i+" :"+freq[i]);
		}
	}

}
