package Assignment4_CoreJava;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;

public class SortArrayList {

	public static void main(String[] args) 
	{
		
		  List<String> item = new ArrayList<String>();
	        
	        item.add("Amit");
	        item.add("Zuvendu");
	        item.add("Sruti");
	        
	        String[] s1= new String[item.size()];
	        for (int i = 0; i < s1.length; i++) 
	        {
				s1[i]=item.get(i);
			}
	       
	        String temp;
			
			for (int i = 0; i < s1.length; i++) 
			{
				for (int j = i+1; j < s1.length; j++) 
				{
					if (s1[i].compareToIgnoreCase(s1[j])>0)
					{
						temp=s1[i];
						s1[i]=s1[j];
						s1[j]=temp;						
						
					}					
				}				
			}
			for (int k = 0; k < s1.length; k++) {
				item.set(k, s1[k]);
			}
			System.out.println(item);
	}

}

