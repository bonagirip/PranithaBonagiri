package Assignment4_CoreJava;
import java.util.*;

public class ReverseArrayList {

	public static void main(String[] args) {

			ArrayList<Integer> a1=new ArrayList<Integer>();
		 	a1.add(0);
		 	a1.add(1);
		 	a1.add(2);
		 	a1.add(3);
		 	a1.add(4);
	       
		 int i=0;
		 int j=a1.size()-1;
		 int tmp=0;
		  while (i<j)
			  
		  {
			tmp=a1.get(j);
			a1.set(j, a1.get(i));
			a1.set(i,tmp);
			
			i++;
			j--;
			
		  }
		  
		  System.out.println(a1);
	}
	        
     
	}