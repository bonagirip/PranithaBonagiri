package Assignment3_CoreJava;

public class NumberformatException {
	public static void main(String[] args) {
		
		try {
			String str = "Devlabs";
			int n  = Integer.parseInt(str);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Number format excpetion , please give proper value to convert integer");
		}
	}
}