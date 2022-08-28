package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelTraversal {

	int data;
	LevelTraversal rt,lt,root;
	
	public void insert(int value)
	{
		if(root==null)
		{
			root = new LevelTraversal();
			root.data = value;
			return;
		}
		Queue<LevelTraversal> q1 = new LinkedList<LevelTraversal>();
		q1.add(root);
		while(!q1.isEmpty())
		{
			LevelTraversal l = q1.remove();
			if(l.lt == null)
			{
				LevelTraversal l1 = new LevelTraversal();
				l1.data = value;
				l.lt = l1;
				return;
			}
			else {
				q1.add(l.lt);
			}
			
			if(l.rt == null)
			{
				LevelTraversal l1 = new LevelTraversal();
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
		Queue<LevelTraversal> q1 = new LinkedList<LevelTraversal>();
		q1.add(root);
		while(!q1.isEmpty())
		{
			LevelTraversal l = q1.remove();
			System.out.println(l.data);
			if(l.lt != null) {
				q1.add(l.lt);
			}
			
			
			if(l.rt != null) {
				q1.add(l.rt);
			}
		}
		
	}
	void inorder(LevelTraversal root)
	{
		if(root == null)
			return ;
		inorder(root.lt);
		System.out.println(root.data);
		inorder(root.rt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelTraversal obj = new LevelTraversal();
		 obj.insert(10);
		 obj.insert( 20);
		 obj.insert( 30);
		 obj.insert( 40);
		 obj.insert( 50);
		 System.out.println("inorder traversal");
		 obj.inorder(obj.root);
		 System.out.println("---------------------------------");
		 System.out.println("level order traversal");
		 obj.levelorder();
		
		
	}

}
