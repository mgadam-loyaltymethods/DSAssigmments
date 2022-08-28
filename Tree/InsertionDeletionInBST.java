package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertionDeletionInBST {

	int data;
	InsertionDeletionInBST rt,lt,root;
	
	public void insert(int value)
	{
		boolean isLeft = false;
		InsertionDeletionInBST  lastParent = null;
		if(root == null)
		{
			root = new InsertionDeletionInBST();
			root.data = value;
		}
		else {
			InsertionDeletionInBST temp = root;
			while(temp!=null)
			{
				if(value == temp.data)
					return;
				if(value<temp.data)
				{
					isLeft = true;
					lastParent = temp;
					temp = temp.lt;
				}
				else
				{
					isLeft = false;
					lastParent = temp;
					temp = temp.rt;
				}
			}
			InsertionDeletionInBST n1 = new InsertionDeletionInBST();
			n1.data = value;
			if(isLeft)
			{
				lastParent.lt = n1;
				
				
			}
			else {
				lastParent.rt = n1;
			}
		
		}
	}
	public InsertionDeletionInBST delete(InsertionDeletionInBST temp,int value) {
		if(temp == null)
			return temp;
		if(value<temp.data)
		{
			temp.lt = delete(temp.lt,value);
		}
		else if(value>temp.data){
			temp.rt = delete(temp.rt, value);
		}
		else {
			if(temp.lt == null)
				return temp.rt;
			else if(temp.rt == null)
				return temp.lt;
			else {
				int d=0;
				InsertionDeletionInBST temp1 = temp.rt;
				while(temp1!=null)
				{
					if(temp1.lt == null)
					{
						d= temp1.data;
						break;
					}
					else {
						temp1 = temp1.lt;
					}
				}
				temp.data = d;
				delete(temp.rt, d);
			}
		}
		return temp;
	}
	void inorder(InsertionDeletionInBST root)
	{
		if(root == null)
			return ;
		inorder(root.lt);
		System.out.println(root.data);
		inorder(root.rt);
	}
	public void levelorder()
	{
		Queue<InsertionDeletionInBST> q1 = new LinkedList<InsertionDeletionInBST>();
		q1.add(root);
		while(!q1.isEmpty())
		{
			InsertionDeletionInBST l = q1.remove();
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
		
		System.out.println("binary search tree operations (insert,delete)");
		InsertionDeletionInBST obj = new InsertionDeletionInBST();
		obj.insert(10);
		obj.insert(5);
		obj.insert(60);
		obj.insert(50);
		obj.insert(30);
		obj.insert(20);
		obj.insert(70);
		obj.insert(65);
		
		System.out.println("----------inorder after insertion-----------------");
		obj.inorder(obj.root);
		
		System.out.println("-----------level order after insertion----------------");
		obj.levelorder();
		
		
		obj.delete(obj.root, 60);
		System.out.println("---------------after deletion-----------------");
		
		System.out.println("-----------inorder----------------");
		obj.inorder(obj.root);
		
		System.out.println("-------------level order--------------");
		obj.levelorder();
		
	}

}
