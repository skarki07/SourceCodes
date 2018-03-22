package Learning;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Kaushal");
		hs.add("Sabina");
		hs.add("DustaAtma");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
