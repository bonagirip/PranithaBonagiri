package Assignment2_CoreJava;

public class SumofDigits {

	public static void main(String[] args) {
		SumofDigits sd = new SumofDigits();
		sd.sumofDigits(1234);
		sd.sumofDigits(222222222);
	}

	private void sumofDigits(int i) {		
		int r=0;
		int sum=0;
		while(i!=0) {
			r=i%10;
			sum=sum+r;
			i=i/10;
		}
		
		System.out.println(sum);		
	}
}

