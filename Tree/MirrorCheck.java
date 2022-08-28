package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorCheck {
	int data;
	MirrorCheck rt,lt,root;
	
	
	
	static boolean isMirror(MirrorCheck m1,MirrorCheck m2)
	{
		if(m1==null && m2==null)
			return true;
		if(m1==null||m2==null)
			return false;
		return m1.data == m2.data && isMirror(m1.lt, m2.rt) && isMirror(m1.rt, m2.lt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MirrorCheck m1 = new MirrorCheck();
		m1.data = 10;
		m1.lt = new MirrorCheck();
		m1.lt.data =20;
		
		MirrorCheck m2 = new MirrorCheck();
		m2.data = 10;
		m2.rt = new MirrorCheck();
		m2.rt.data =20;
		
		
		System.out.println(isMirror(m1, m2));
		

	}

}
