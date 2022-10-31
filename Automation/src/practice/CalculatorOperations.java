package practice;
import java.util.Scanner;
public class CalculatorOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // System.in = standard input stream
		
		System.out.println("Enter your option: 1. Add 2. Subtract 3. Multiplication 4. Division");
		
		int input = scan.nextInt(); // scan.nextInt is used for next value
		
//		float nextFloat();
//		double nextDouble();
//		byte nextByte();
//		string nextLine();
//		boolean nextBoolean();
		
		
		Calculator cal = new Calculator();
		
		if(input == 1)
		{
			System.out.println("Add result" + cal.add(10, 5));
		}
		else if(input == 2)
		{
			System.out.println("Subtract result" + cal.subtract(20, 5));
		}
		else if(input == 3)
		{
			System.out.println("Multiplication result" + cal.multiplication(20, 5));
		}
		else if(input == 4)
		{
			System.out.println("Division result" + cal.division(20, 5));
		}
		else {
			System.out.println("NO RESULT :) ");
		}
		
//		Calculator cal = new Calculator();
//		System.out.println("Add result" + cal.add(10, 5));
//		System.out.println("Subtract result" + cal.subtract(20, 5));
//		System.out.println("Multiplication result" + cal.multiplication(10, 5));
//		System.out.println("Division result" + cal.division(10, 5));
		
	}

}
