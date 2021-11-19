package Assignment4_CoreJava;
import java.util.*;

public class ConvertKeytoList {

	public static void main(String[] args) {
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		hm.put('A',1);
		hm.put('B',2);
		hm.put('C',3);
		hm.put('D',4);
		hm.put('E',5);
		List al = new ArrayList();
		
		
		int i=0;
		while (i<=(hm.size()-1)) 
		{
			
			for(Map.Entry<Character,Integer> m:hm.entrySet()) {
				al.add(i, m.getKey());
				i++;
				
			}
		}
		
		System.out.println(al);
		 
	}


}