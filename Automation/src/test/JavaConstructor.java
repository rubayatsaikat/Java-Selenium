package test;

public class JavaConstructor {
	
	JavaConstructor(){
		System.out.println("Constructor is called!!");		
	}
	int a=5, b=10;
	void showsum(int x, int y) {
		System.out.println("SUM: " + (x+y));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaConstructor jc = new JavaConstructor();
		jc.showsum(10,15);

	}

}
