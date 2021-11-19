package Assignment3_CoreJava;

import java.util.*;

public class Twopalindrome {   
    
    static boolean PalindromeCheck(String str) 
    {          
        int i = 0, j = str.length() - 1;  
       
        while (i < j) 
        {      
            if (str.charAt(i) == str.charAt(j)) 
                return true; 
            i++; 
            j--; 
        } 
        
        return false; 
    }   

    public static void main(String[] args) 
    { 
        String str = "abba"; 
  
        if (PalindromeCheck(str)) 
            System.out.print("Yes it is Palindrome"); 
        else
            System.out.print("Not Palindrome"); 
    } 
} 
