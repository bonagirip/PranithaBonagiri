package Assignment1_CoreJava;

public class SortArray {    
    public static void main(String[] args) {        
            
           
        int [] array = new int [] {23,45,8};     
        int t= 0;    
            
        for (int i = 0; i < array.length; i++) {     
            for (int j = i+1; j < array.length; j++) {     
               if(array[i] > array[j]) {    
                   t = array[i];    
                   array[i] = array[j];    
                   array[j] = t;  
               }     
            }     
        }    
          
        System.out.println();    
            
        for (int i = 0; i < array.length; i++) {     
            System.out.print(array[i] + " ");    
        }    
    }    
}    