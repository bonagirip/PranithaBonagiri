package Assignment4_CoreJava;
import java.util.*;

public class SetViewFromHashtable {

	public static void main(String[] args) {
		
		Hashtable<String,String> ht= new Hashtable<String,String>();
		ht.put("Mobile1", "iphone");
		ht.put("Mobile2", "Galaxy");
		ht.put("Mobile3", "NokiaN95");
		Set hs = ht.keySet();
		Iterator itr = hs.iterator(); 
        while (itr.hasNext()) 
         System.out.println(itr.next()); 
		
	}

}

