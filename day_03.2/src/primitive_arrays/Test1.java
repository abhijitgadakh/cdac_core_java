package primitive_arrays;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name of the class of object sc: " + sc.getClass());
		
		System.out.println("Enter the size of the array");
		
		double[] data; //array type of reference variable
		data = new double[sc.nextInt()];
		
		System.out.println("Default array elements using for loop");
		for(int i=0;i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		System.out.println("\nDefault array elements using for-each loop");
		for(double d : data) {
			System.out.println(d);
		}
		
		for(int i=0;i<data.length; i++) {
			System.out.print("\nEnter value for index: " + i);
			data[i] = sc.nextDouble();
		}
		
		System.out.println("\n\nUpdated array elements using for-each loop");
		for(double d : data) {
			System.out.println(d);
		} 
		
		
		//Name of the class loaded
		System.out.println("Name of the class: " + data.getClass()); //[D@17f6480
		//Closig the Scanner
		sc.close();

	}

}
