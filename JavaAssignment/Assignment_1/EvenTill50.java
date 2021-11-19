package Assignment1_CoreJava;

public class EvenTill50 {

	public static void main(String[] args) {

		System.out.println("Even numbers list till 50 are ");
		
		for (int i = 2; i <= 50; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}

