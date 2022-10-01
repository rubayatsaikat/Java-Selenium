package test;
import test.Add;


public class SoftwareTesting {
	static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add();
		sum = a.add(10, 15);
		System.out.println(sum);
		System.out.println("Run Successfully");
		
	}

}
