package Assignment2_CoreJava;

public class AverageOfArray {

	public static void main(String[] args) {
	
		int[] avg = {1,2,3,4,5};
		int sum=0;
		for (int i = 0; i < avg.length; i++) {
			sum=sum+avg[i];
		}
		System.out.println("Average of array is:"+sum/avg.length);
	}

}