package Assignment1_CoreJava;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base..");
		double base  = sc.nextDouble();
		System.out.println("Enter Height..");
		double height = sc.nextDouble();
		
		area = base * height/2;
		
		System.out.println(area);
		
		
	}

}