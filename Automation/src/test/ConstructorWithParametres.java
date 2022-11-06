package test;

public class ConstructorWithParametres {

	
	ConstructorWithParametres(int x, int y){
		System.out.println("Constructor is called!!");
		System.out.println("Sum inside constructor:" + (x+y));
	}
	int a=5, b=10;
	void showsum(int x, int y) {
		System.out.println("SUM: " + (x+y));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorWithParametres cwp = new ConstructorWithParametres(10,15);
		cwp.showsum(200, 40);
		
	}

}
