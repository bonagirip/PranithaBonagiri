package Assignment4_CoreJava;
import java.util.*;

public class HashSettoObject {

	public static void main(String[] args) 
	{
		
		HashSet hs= new HashSet();
		hs.add("Dev");
		hs.add("Lab");
		hs.add("Java");
		hs.add("Trainning");
		
		
		Object[] obArr = hs.toArray();
		
		for (Object ob : obArr) {
			System.out.println("Object from the Hashset "+ob);
			
		}
		
		
	}

}