package Array2D;
//tc:o(n^2)
//sc:o(1)
public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				  {15, 30,  20, 19},
				  {101, 202 , 45 , 60},
				  {75 , 101 , 500 ,34},
				  {35 , 28 ,  19 ,  0}
		};
		int l=-100;
		
		 for (int i = 0; i < arr.length; i++) {
		      for(int j = 0; j < arr[i].length; j++) {
		      if(arr[i][j]>l)
		    	  l=arr[i][j];
		      }
		    }
		 System.out.println(l);
	}

}
