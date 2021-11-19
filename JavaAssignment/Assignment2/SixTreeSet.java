package Assignment4_CoreJava;
import java.util.*;


public class SixTreeSet {

	public static void main(String[] args) {
	TreeSet set=new TreeSet();
	set.add(23);
    set.add(56);
    set.add(71);
    set.add(91);
    set.add(100);
    set.add(40);
    set.add(60);
    set.add(12);

    System.out.println( set.pollFirst());
    System.out.println(set.pollLast());

	}

}