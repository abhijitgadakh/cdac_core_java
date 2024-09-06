import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two number");

		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.printf("Result: %.3f %n", (num1*num2));
		
		sc.close();
	}

}
