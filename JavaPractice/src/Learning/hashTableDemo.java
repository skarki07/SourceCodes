package Learning;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(0, "Samir");
		ht.put(1,"Sabina");
		ht.put(21, "Samichhya");
		ht.put(3, "Usha");
		System.out.println(ht.get(21));
		/*ht.remove(21);
		System.out.println(ht.get(21));
		*/
		Set sn= ht.entrySet();
		Iterator it=sn.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	

	}

}
