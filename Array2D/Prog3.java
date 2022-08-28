package Array2D;
//tc:o(m+n)
//sc:o(1)
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=37;
		String val="";
		int arr[][] = {
				{10, 20, 30 ,40},
				  {15, 25, 35, 45},
				  {27 ,29 ,37, 48},
				  {32 ,33 ,39 ,50}
  
		};
	
	int i=0,j=3;

		while(i<4&&j>=0)
		{
			if(arr[i][j]== a)
			{
				val = "present";
				break;
			}
			if(arr[i][j]>a)
				j--;
			if(arr[i][j]<a)
				i++;
		}
		if(val.equals("present"));
		else
			val = "not present";
			
		
		System.out.println(val);
		
	}

}
