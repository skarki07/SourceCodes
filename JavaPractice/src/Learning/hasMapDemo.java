package Learning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hasMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0, "Samir");
		hm.put(1,"Sabina");
		hm.put(21, "Samichhya");
		hm.put(3, "Usha");
		System.out.println(hm.get(21));
		hm.remove(21);
		System.out.println(hm.get(21));
		
		Set sn= hm.entrySet();
		Iterator it=sn.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		
	}

}
