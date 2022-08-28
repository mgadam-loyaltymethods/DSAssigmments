package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftRightView {

	int data;
	LeftRightView rt,lt,root;
	
	public void insert(int value)
	{
		if(root==null)
		{
			root = new LeftRightView();
			root.data = value;
			return;
		}
		Queue<LeftRightView> q1 = new LinkedList<LeftRightView>();
		q1.add(root);
		while(!q1.isEmpty())
		{
			LeftRightView l = q1.remove();
			if(l.lt == null)
			{
				LeftRightView l1 = new LeftRightView();
				l1.data = value;
				l.lt = l1;
				return;
			}
			else {
				q1.add(l.lt);
			}
			
			if(l.rt == null)
			{
				LeftRightView l1 = new LeftRightView();
				l1.data = value;
				l.rt = l1;
				return;
			}
			else {
				q1.add(l.rt);
			}
		}
		
	}
	
	public void levelorder()
	{
		Queue<LeftRightView> q1 = new LinkedList<LeftRightView>();
		q1.add(root);
		while(!q1.isEmpty())
		{
			LeftRightView l = q1.remove();
			System.out.println(l.data);
			if(l.lt != null) {
				q1.add(l.lt);
			}
			
			
			if(l.rt != null) {
				q1.add(l.rt);
			}
		}
		
	}
	
	int maxDepth(LeftRightView root)
	{
		if(root == null)
			return 0;
		return 1+ Math.max(maxDepth(root.lt), maxDepth(root.rt));
	}
	
	public void leftView()
	{
		Queue<LeftRightView> q1 = new LinkedList<LeftRightView>();
		q1.add(root);
		while(!q1.isEmpty())
		{
			int size = q1.size();
			
			for(int i=0;i<size;i++)
			{
				LeftRightView l = q1.peek();
				if(i==0)
					System.out.println(l.data);
				q1.remove();
				
				if(l.lt != null) {
					q1.add(l.lt);
				}
				
				
				if(l.rt != null) {
					q1.add(l.rt);
				}
				
			}
			
			
		}
		
	}
	
	
	public void rightView()
	{
		Queue<LeftRightView> q1 = new LinkedList<LeftRightView>();
		q1.add(root);
		while(!q1.isEmpty())
		{
			int size = q1.size();
			
			for(int i=0;i<size;i++)
			{
				LeftRightView l = q1.peek();
				if(i==(size-1))
					System.out.println(l.data);
				q1.remove();
				
				if(l.lt != null) {
					q1.add(l.lt);
				}
				
				
				if(l.rt != null) {
					q1.add(l.rt);
				}
				
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//insert based on level order
		LeftRightView obj = new LeftRightView();
		 obj.insert(10);
		 obj.insert( 20);
		 obj.insert( 30);
		 obj.insert( 40);
		 obj.insert( 50);

		
		 System.out.println("level order traversal");
		 obj.levelorder();
		 
		 System.out.println("------------------------ left view");
		 obj.leftView();
		 System.out.println("------------------------ rightview");
		 obj.rightView();
		 
		 System.out.println("------------------------ max depth");
		System.out.println(obj.maxDepth(obj.root)); 
		
		
	}

}
