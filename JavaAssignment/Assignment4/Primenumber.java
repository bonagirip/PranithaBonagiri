package Assignment2_CoreJava;

public class Primenumber {

	public void isPrime(int isPrime) {
		int count=0;
		for (int i = 2; i <= isPrime/2; i++) {
			if(isPrime%i == 0) {
				count++;
			}
		}
		if(count>=1) {
			System.out.println(isPrime + " is not a PrimeNumber");
		}else {
			System.out.println(isPrime + " is a Prime Number");
		}
	}	
	
	public static void main(String[] args) {
		Primenumber iP = new Primenumber();
		iP.isPrime(4);
		iP.isPrime(12);
		iP.isPrime(17);
		iP.isPrime(197);	

	}

}

