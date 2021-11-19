package Assignment2_CoreJava;

public class ReverseaNumber {

	public static void main(String[] args) {
		
		ReverseaNumber rv = new ReverseaNumber();
		rv.reversenumber(123);
		rv.reversenumber(5);
	}

	private void reversenumber(int number) {		
		int reverse=0;
		int remainder=0;
		while(number!=0) {
			remainder = number%10;
			reverse = (reverse*10)+remainder;
			number = number/10;
		}
		System.out.println("Reverse of give number is " +reverse);	
		
	}
}

