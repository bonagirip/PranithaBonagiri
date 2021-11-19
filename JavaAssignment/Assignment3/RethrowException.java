package Assignment3_CoreJava;

public class RethrowException {

	public static void main(String[] args) throws Exception {
		String name = null;

		try {
		    name.equals("Joe");
		} catch (NullPointerException e) {
		   throw e;
		}

	}

}