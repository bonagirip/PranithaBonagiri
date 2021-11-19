package Assignment4_CoreJava;

import java.util.*;
import java.io.*;

public class DuplicateCharsHashMap {

	public static void main(String[] args) {
		
		String str = "DevLabs"; 
        characterCount(str);
			}
	static void characterCount(String inputString) 
    { 
        
        HashMap<Character, Integer> cnt = new HashMap<Character, Integer>(); 
       
        
  
        char[] strArray = inputString.toCharArray(); 
        
        
        for (char c : strArray) { // 5 times.
            if (cnt.containsKey(c)) { 
            		cnt.put(c, cnt.get(c) + 1); 
            } 
            else {  
               
                cnt.put(c, 1); 
            } 
        }   
      
        for (Map.Entry entry : cnt.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
      
    } 

}