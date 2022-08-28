package Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TopBottomView {
	
	int data,hd;
	TopBottomView lt,rt,root;
	
	
	Map<Integer, Integer> topViewMap
    = new HashMap<Integer, Integer>();
	
	Map<Integer, Integer> bottomViewMap
    = new HashMap<Integer, Integer>();
	public void insert(int value)
	{
		if(root==null)
		{
			root = new TopBottomView();
			root.data = value;
			root.hd = 0;
			return;
		}
		Queue<TopBottomView> q1 = new LinkedList<TopBottomView>();
		q1.add(root);
		while(!q1.isEmpty())
		{
			TopBottomView l = q1.remove();
			if(l.lt == null)
			{
				TopBottomView l1 = new TopBottomView();
				l1.data = value;
				l1.hd = l.hd-1;
				l.lt = l1;
				return;
			}
			else {
				q1.add(l.lt);
			}
			
			if(l.rt == null)
			{
				TopBottomView l1 = new TopBottomView();
				l1.data = value;
				l1.hd = l.hd +1;
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
		Queue<TopBottomView> q1 = new LinkedList<TopBottomView>();
		q1.add(root);
		while(!q1.isEmpty())
		{
			TopBottomView l = q1.remove();
			
			 if (!topViewMap.containsKey(l.hd)) {
	                topViewMap.put(l.hd, l.data);
	            }
			 
			 bottomViewMap.put(l.hd, l.data);
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
		TopBottomView obj = new TopBottomView();
		 obj.insert(10);
		 obj.insert( 20);
		 obj.insert( 30);
		 obj.insert( 40);
		 obj.insert( 50);
		 System.out.println("level order traversal");
		 //map values of top and bottom will be stored while calling this method
		 obj.levelorder();
		 System.out.println("------------top view---------------------");
		  for(Map.Entry<Integer, Integer> m:obj.topViewMap.entrySet()){  
			   System.out.println("Horizontal Depth: "+m.getKey()+"          value: "+m.getValue());  
			  }  
		  
		  System.out.println("---------------bottom value------------------");
		  for(Map.Entry<Integer, Integer> m:obj.bottomViewMap.entrySet()){  
			  System.out.println("Horizontal Depth: "+m.getKey()+"           value: "+m.getValue());  
			  }  
	}

}
