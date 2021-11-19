package Assignment4_CoreJava;
import java.util.*;

public class HashTableKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht= new Hashtable<Integer,String>();
		ht.put(100, "Broadridge");
		ht.put(101, "ADP");
		ht.put(102, "CDK");
		ht.put(103, "Wilco");
		
		if (ht.containsKey(104))
			System.out.println("Given Key Exists");

		else 
			
			System.out.println("Given Key does not Exists");	

	}

}

