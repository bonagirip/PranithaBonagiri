package Assignment2_CoreJava;

public class DuplicatesinArray {

	public static void main(String[] args) {
		
		String[] a = {"Learning", "Java", "is" , "Fun", "Fun"};
		int[] b = {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		DuplicatesinArray dup = new DuplicatesinArray();
		dup.findDupes(a);
		dup.findDupes(b);
	}

	private void findDupes(int[] b) {
		
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(b[i]==b[j]) {
					System.out.println("Duplicate element is "+ b[i]);
				}
			} 
	}
	
	}

	private void findDupes(String[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
				System.out.println("Duplicate array found = " + a[i]) ;
				
				}			
		}
			
	}	
		
	}
}

