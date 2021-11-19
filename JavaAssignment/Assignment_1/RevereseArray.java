package Assignment1_CoreJava;

public class RevereseArray {
	public static void main(String[] args) {
		
		int[] arrayInt = {1,2,3,4,5};
		String[] arrayString = {"Sudheer","Allam"};
		
		RevereseArray rv = new RevereseArray();
		rv.reversearray(arrayInt);
		rv.reversearray(arrayString);		
		
	}
	
	private void reversearray(String[] arrayString) {
		int size = arrayString.length;
		String[] reverse = new String[size];
		int i=0;
		int temp=size-1;
 		while(i>=0 && i < size) {
 			reverse[i] = arrayString[temp];
 			i++;
 			temp--;
 		}
 		System.out.println(" ");
 		for (int j = 0; j < reverse.length; j++) {
			System.out.print(reverse[j] + " ");
		}
		
	}

	private void reversearray(int[] arrayInt) {
		int size = arrayInt.length;
		int[] reverse = new int[size];
		int i=0;
		int temp=size-1;
 		while(i>=0 && i < size) {
 			reverse[i] = arrayInt[temp];
 			i++;
 			temp--;
 		}
 		System.out.println(" ");
 		for (int j = 0; j < reverse.length; j++) {
			System.out.print(reverse[j] + " ");
		}
		
		
	}

}