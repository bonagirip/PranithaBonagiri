package Assignment1_CoreJava;

public class PrimeFirst10
{
	public static void main(String[] args)   
	{  
	int cnt=0,num=0,i=1,j=1;  
	while(num<10)  
	{  
	j=1;  
	cnt=0;  
	while(j<=i)  
	{  
	if(i%j==0)  
	cnt++;  
	j++;   
	}  
	if(cnt==2)  
	{  
	System.out.println(i);  
	num++;  
	}  
	i++;  
	}  
	}  
}