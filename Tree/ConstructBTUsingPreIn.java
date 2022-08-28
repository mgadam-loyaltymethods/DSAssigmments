package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructBTUsingPreIn {

	static int pIndex = 0;
	int data;
	ConstructBTUsingPreIn rt,lt,root;
	
	ConstructBTUsingPreIn build(int in[], int pre[], int iStart, int iEnd)
    {
        if (iStart > iEnd)
            return null;
 
      
        ConstructBTUsingPreIn t1 = new ConstructBTUsingPreIn();
        t1.data=pre[pIndex];
        pIndex++;
        
        if(iStart == iEnd)
        	return t1;
 
       
        int inIndex=0;
        for(int i = iStart;i<=iEnd;i++)
        {
        	if(in[i]== t1.data)
        		inIndex = i;
        }
 
      
        t1.lt = build(in, pre, iStart, inIndex - 1);
        t1.rt = build(in, pre, inIndex + 1, iEnd);
 
        return t1;
    }
 
	public void levelOrder()
	{
		Queue<ConstructBTUsingPreIn> q1 = new LinkedList<ConstructBTUsingPreIn>();
		q1.add(root);
		while(!q1.isEmpty())
		{
			ConstructBTUsingPreIn l = q1.remove();
			System.out.println(l.data);
			if(l.lt != null) {
				q1.add(l.lt);
			}
			
			
			if(l.rt != null) {
				q1.add(l.rt);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int in[] = {40,20,50,10,60,30,70};
		int pre[] = {10,20,40,50,30,60,70};
		int iStart = 0,iEnd = in.length-1;
		ConstructBTUsingPreIn obj = new ConstructBTUsingPreIn();
		
		obj.root = obj.build(in, pre, iStart, iEnd);
		//Expecting output: 10 20 30 40 50 60 70
		System.out.println("binary tree after building with inorder and postorder");
		obj.levelOrder();

	}

}
